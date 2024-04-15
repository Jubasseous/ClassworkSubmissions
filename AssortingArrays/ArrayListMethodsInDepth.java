package Classwork;

import java.util.ArrayList;

/**
 * Make a class called ArrayListMethodsInDepth with a main method. 
 * In the main method, instatiate an empty ArrayList foods that stores Strings. 
 * Then add the following Strings to foods: "Apples", "Bread", "Cookies". 
 * After each task (except task 1) print out the length of the foods ArrayList.
 * @author Jubes
 */
public class ArrayListMethodsInDepth 
{

	public static void main(String[] args)
	{
		//Instantiate an ArrayList
		ArrayList<String> foods = new ArrayList<String>();
		
		//add different food items 
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//Task 1: Print out the size of the foods ArrayList. 
		System.out.println(foods.size());
		
		//Task 5: This method gives the length of the array list and in this case returned 3
		
		//Task 2: Inside of a print statement, add the String "Dole Whip" to foods. 
		//In the line comment for this code, state what it prints.
		System.out.println(foods.add("Dole Whip"));
		//It printed true
	
		//Task 5: This method adds Dole Whip to the end of the array list and returns a boolean, true
		//The Add method adds an object to the end of the array list and will return a boolean
		
	
		//Print size
		System.out.println(foods.size());
		
		//Task 3: Inside of a print statement, use the .set(E) method to 
		//change "Bread" in foods to "Butter". Comment what it prints. 
		System.out.println(foods.set(1, "Butter"));
		//Prints out bread 
		
		//Task 5: This method changes bread to butter and returns bread
		//The set method will change the object at in index to another and will return 
		//whatever object was changed
		
		//Print size
		System.out.println(foods.size());
		
		//Task 4: Inside of a print statement, use the .remove(int) method to 
		//remove "Cookies" from foods. Comment what it prints.
		System.out.println(foods.remove(2));
		//Prints cookies
		
		//Task 5: This method removes Cookies from the array list and returns Cookies, the object removed. 
		//The remove method will remove whatever object there is at the index provided and will return the object removed.
		
		
		//Print size
		System.out.println(foods.size());
		
		//Task 5: For each task, go back and comment what the method you are 
		//calling does, and what the method returns (both in general and in this case).



		

	}

}
