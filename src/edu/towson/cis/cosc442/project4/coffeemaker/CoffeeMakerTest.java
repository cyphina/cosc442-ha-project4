package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 * Tests for the CoffeeMaker class
 */

public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
	}

	/** Test successful adding of a recipe*/
	public void testAddRecipe1() {
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		assertTrue(cm.addRecipe(r1));	
	}
	
	/** Test failure on adding the same recipe (at least according to thee doesRecipeExist() which checks based on = operator) */
	public void testAddRecipe2() {
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		assertTrue(cm.addRecipe(r1));	
		assertFalse(cm.addRecipe(r1));	
	}
	
	/** Test failure on adding a recipe when recipe book is full */
	public void testAddRecipe3() {
		r1 = new Recipe();
		Recipe r2 = new Recipe();
		Recipe r3 = new Recipe();
		Recipe r4 = new Recipe();
		Recipe r5 = new Recipe();
		
		r1.setName("Coffee");
		r2.setName("Expresso");
		r3.setName("Dragon's Blood Coffee");
		r4.setName("Your mom's juice");
		r5.setName("Your other mom's juice");
		
		assertTrue(cm.addRecipe(r1));	
		assertTrue(cm.addRecipe(r2));	
		assertTrue(cm.addRecipe(r3));	
		assertTrue(cm.addRecipe(r4));	
		assertFalse(cm.addRecipe(r5));	
	}
	
	/**--Inventory adding tests, making sure to completely cover the tests based on decision coverage--*/
	
	/** Sucessful adding case */
	public void testAddInventory1() {
		int amtCoffee = 3;
		int amtMilk = 3;
		int amtSugar = 0;
		int amtChocolate = 3;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	public void testAddInventory2() {
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		assertEquals(false, result);
	}
	
	public void testAddInventory3() {
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		assertEquals(false, result);
	}

	public void testAddInventory4() {
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	public void testAddInventory5() {
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = cm.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**Test successful deletion of a recipe*/
	public void testDeleteRecipe1() {
		r1 = new Recipe();
		r1.setName("PapayaCoffee");
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	
	/**Test failure to delete due to passing in a null recipe */
	public void testDeleteRecipe2() {
		r1 = new Recipe();
		cm.addRecipe(r1);
		assertFalse(cm.deleteRecipe(null));
	}
	
	/**Test failure to delete because recipe isn't in the array */
	public void testDeleteRecipe3() {
		r1 = new Recipe();
		cm.addRecipe(r1);
		Recipe r2 = new Recipe();
		assertFalse(cm.deleteRecipe(r2));
	}

	/** Successful edit of a recipe */
	public void testEditRecipe1() {
		r1 = new Recipe();
		r1.setName("Papayadrink");
		cm.addRecipe(r1);
		r1.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, r1));
	}
	
	/**Try to edit recipe but no valid recipes with a name in the recipe list*/
	public void testEditRecipe2() {
		r1 = new Recipe();
		r1.setName(null);
		cm.addRecipe(r1);
		r1.setAmtSugar(2);
		assertFalse(cm.editRecipe(r1, r1));
	}
	/**Fail because there is no existing recipe equal to newrecipe so we're not editing an existing item*/
	public void testEditRecipe3() {
		r1 = new Recipe();
		r1.setName("Papayadrink");
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		assertFalse(cm.editRecipe(r1, newRecipe));
	}
	
	/** Problematic way of trying to edit a recipe which should fail.  Editing recipe function itself is broken but this 
	 * just covers more of the problematic function*/
	public void testEditRecipe4() {
		r1 = new Recipe();
		r1.setName("Papayadrink");
		cm.addRecipe(r1);
		
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		
		assertTrue(cm.editRecipe(r1, newRecipe));
		//According to the edit function, when we try to edit something, it will make the old copy stored in the array into a default
		//Recipe() then add in th new recipe.
		assertTrue(cm.editRecipe(r1, newRecipe));
		assertTrue(cm.editRecipe(r1, newRecipe));
		assertFalse(cm.editRecipe(r1, newRecipe));
	}
	
	/** Check to see what's in the inventory */
	public void testCheckInventory() {
		Inventory result = cm.checkInventory();
		assertNotNull(result);
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
	}
	
	/**Successful making of some kind of coffee */
	public void testMakeCoffee_1() {
		
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		testAddInventory1();
		
		int amtPaid = 51;
		int result = cm.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}
	
	/**Unsuccessful attempt at making coffee due to not enough price*/
	public void testMakeCoffee2() {
		
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		testAddInventory1();
		
		int amtPaid = 49;
		int result = cm.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(49, result);
	}
	
	/**Unsuccessful attempt at making coffee due to not enough supplies*/
	public void testMakeCoffee3() {
		
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(20);
		r1.setAmtChocolate(0);
		
		int amtPaid = 51;
		int result = cm.makeCoffee(r1, amtPaid);

		// add additional test code here
		assertEquals(51, result);
	}
	
	/**Test to see if the recipe accessors works */
	public void testGetRecipe() {
		Recipe[] recipes = cm.getRecipes();
		assertEquals(4, recipes.length);
		assertEquals(null, recipes[0].getName());
	}
	
	/**Test to see if we can get the recipe associated with a name.  Should sucessfully do so in this test case*/
	public void testGetRecipeForName1() {
			Recipe r1 = new Recipe();
			r1.setName("Coffee");
			cm.addRecipe(r1);
			String name = "Coffee";

			Recipe result = cm.getRecipeForName(name);
			assertEquals(result, r1);
		}
	
}