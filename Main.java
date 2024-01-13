import java.util.*;
import recipe.*;

public class Main {

	// DO NOT change this method
	public static void main(String[] args) {

		// Breakfast Items
		Recipe breakfastSmoothie = new UncookedRecipe("Breakfast Smoothie",
			new String[] {
				"Strawberry",
				"Milk",
			 	"Crushed Ice",
				"Honey"},
			"Cold");

		Recipe oatmeal = new CookedRecipe("Steel Cut Oatmeal",
			new String[] {
				"Steel Cut Oats",
				"Cinnamon",
				"Brown Sugar",
				"Milk",
				"Raisins",
				"Cranberries"
			}, 120, 200);

		// Dinner Items
		Recipe jerkChicken = new CookedRecipe("Jerk Chicken",
			new String[] {
				"Chicken Thighs (skin and bone in)",
				"Salt (to taste)",
				"Green Onion",
				"Walker's Wood Jerk Seasoning",
				"Soy Sauce (just a splash)"
			}, 45, 400);

		Recipe gardenSalad = new UncookedRecipe("Garden Salad",
			new String[] {
				"Lettuce",
				"Tomato",
				"Cucumber slices",
				"Sliced Bell Pepper",
				"Spinach",
				"Your favorate Salad Dressing"
			}, "Room Temperature");

		RecipeBook breakfastCookbook = new RecipeBook("Breakfast Recipes");
		breakfastCookbook.addRecipe(breakfastSmoothie);
		breakfastCookbook.addRecipe(oatmeal);

		ArrayList<Recipe> dinnerRecipes = new ArrayList<>();
		dinnerRecipes.add(jerkChicken);
		dinnerRecipes.add(gardenSalad);

		RecipeBook dinnerCookbook = new RecipeBook("Dinner-time Classics", dinnerRecipes);

		printRecipes(breakfastCookbook);
		printRecipes(dinnerCookbook);
	}

	// TODO: provide an implementation for this method, use the Iterator to access the Recipe objects
	private static void printRecipes(RecipeBook book) {
        }

}
