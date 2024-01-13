# Assignment 5 - Interfaces
In this assignment you will create a Java program that allows someone to store their recipes in one or more recipie books and print the contents of each book.  You will need to use your knowledge of Interfaces and Iterators to do this. Starter code is provided to build the recepie books and print their contents out.  You must provide the implementations it is expecting.

## Input
None.  All input for the program is hard-coded in the starter code provided.

## Output
Your output should match the output below exactly:

	$> java Main

	Book Title: Breakfast Recipes
	
	Breakfast Smoothie (Serving temperature: Cold)
	 - Strawberry
	 - Milk
	 - Crushed Ice
	 - Honey
	
	Steel Cut Oatmeal (Cook at 200 degrees for 120 minutes)
	 - Steel Cut Oats
	 - Cinnamon
	 - Brown Sugar
	 - Milk
	 - Raisins
	 - Cranberries
	
	Book Title: Dinner-time Classics
	
	Jerk Chicken (Cook at 400 degrees for 45 minutes)
	 - Chicken Thighs (skin and bone in)
	 - Salt (to taste)
	 - Green Onion
	 - Walker's Wood Jerk Seasoning
	 - Soy Sauce (just a splash)
	
	Garden Salad (Serving temperature: Room Temperature)
	 - Lettuce
	 - Tomato
	 - Cucumber slices
	 - Sliced Bell Pepper
	 - Spinach
	 - Your favorate Salad Dressing

## Implementation Notes
- You will need to create an interface called `Recipe` that defines the following methods:
   - `String getName()`: returns the name of the recipie
   - `String[] getIngredients()`: returns an array of ingredients
   - `String getPrepInstructions()`: returns a `String` describing the time required to prepare the meal
- You will need to create two different implementations of the `Recipe` interface:
   - `CookedRecipe`: This implementation should be used for recipes that require cooking. It should have the following additional properties and methods related to cooking (along with their getters)
      - **cookingTime**: an `int` representing the cooking time (the 3rd parameter in its constructor)
      - **cookingTemperature**: an `int` representing the cooking temperature. (the 4th parameter in its constructor)
   - `UncookedRecipe`: This implementation should be used for recipes that do not require cooking, such as salads and smoothies. It should have the following additional property (along with its getter)
      - **servingTemperature**: a `String` describing the serving temperature (for example "Room Temperature").
- You will need to create a class called `RecipeBook` that stores a list of `Recipe` objects and implements the `Iterator` interface to allow you to loop through the list of recipes (as you a printing them).
- The `CookedRecipe`, `Recipe`, `RecipeBook` and `UncookedRecipe` classes should all live in their own package called `recipie`.
- To get started, you should first create the `Recipe` interface and define the methods that it should have. Next, you should create the two different implementations of the `Recipe` interface. Finally, you should create the `RecipeBook` class and complete the code in the application class (`Main`).
