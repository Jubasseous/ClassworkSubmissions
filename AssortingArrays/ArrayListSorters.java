package Classwork;

import java.util.ArrayList;

public class ArrayListSorters
{

	public static void main(String[] args) 
	{
		/*
		 * Task 1: In the main method, instantiate two ArrayLists nums and names of Integers 
		 * (remember ints wouldn't work for ArrayLists) and Strings respectively. Fill them with 
		 * five unsorted values (nums out of numerical order and names out of alphabetical order). 
		 */
	
		
		//instantiate an arraylist of Integers
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//add the nums
		nums.add(4);
		nums.add(3);
		nums.add(10);
		nums.add(7);
		nums.add(14);
		
		//instatiate an arraylist of Strings
		ArrayList<String> names = new ArrayList<String>();
		
		//add the names
		names.add("Trauger");
		names.add("Keanu");
		names.add("Blythe");
		names.add("Ayla");
		names.add("Phil");
		
		/*
		 * Task 2: Create a void method bubbleSortNumbers that is 
		 * passed an ArrayList and bubble sorts it just like we did for arrays. 
		 */
		bubbleSortNumbers(nums);
		System.out.println(nums);
		
		/*
		 * Task 3: Create a void method bubbleSortStrings that is passed an 
		 * ArrayList and bubble sorts it into alphabetical order. 
		 */
		bubbleSortStrings(names);
		System.out.println(names);

	}
	
	/**
	 * Task 3: Create a void method bubbleSortStrings that is 
	 * passed an ArrayList and bubble sorts it into alphabetical order. 
	 * @param names
	 */
	private static void bubbleSortStrings(ArrayList<String> names) 
	{

		//for loop to traverse the array and makes sure that the for loop within runs for 
		//each element 
		for(int i = 0; i < names.size(); i++)
		{
		
			//for loop that will check an element and swap if the
			//element before is greater. 
			for(int j = 1; j < names.size() - i ; j++)	
			{
					
				//checks if the element at j is less than the element before
				//Negative num when comparing a higher alphabetical to a lower (a to b) = -
				//Positive num when comparing a lower to a higher ( b to a ) = +
				/*
				 * An int value: 0 if the string is equal to the other string
				 * < 0 if the string is lexicographically less than the other string 
				 * > 0 if the string is lexicographically greater than the other string (more characters)
				 */
				if( names.get(j).compareTo(names.get(j-1)) < 0)
				{
					//declare a temp to be the element before j
					String temp = names.set(j,names.get(j-1));
					//Switches the element before with the element at j 
					names.set(j-1, temp);
				}	
			}
		}
	}
		
	

	/**
	 * Task 2: Create a void method bubbleSortNumbers 
	 * that is passed an ArrayList and bubble sorts it just like we did for arrays. 
	 * @param nums
	 */
	private static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
			
		//for loop to traverse the array and makes sure that the for loop within runs for 
		//each element 
		for(int i = 0; i < nums.size(); i++)
		{
		
			//for loop that will check an element and swap if the
			//element before is greater. 
			for(int j = 1; j < nums.size() - i ; j++)	
			{
					
				//checks if the element at j is less than the element before
				if( nums.get(j) < nums.get(j-1))
				{
					//declare a temp to be the element before j
					Integer temp = nums.set(j,nums.get(j-1));
					//Switches the element before with the element at j 
					nums.set(j-1, temp);	
				}	
			}
		}
	}
	
}
