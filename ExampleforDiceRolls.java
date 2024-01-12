/**
 * Examples for the final dice task
 * @author Jubes
 */

import java.util.Scanner;

public class ExampleRolls 
{

	public static void main(String[] args) 
	{
		//instantiate a scanner
		Scanner newScan = new Scanner(System.in);
		
		//roll200();
		
		
		//declare a string variable that takes in the user's word
		String x = newScan.nextLine();
		//declare a character that takes in the user's letter
		char y = newScan.next().charAt(0);
		
		//declare method 		
		countChars(x, y);
		
		//close scanner
		newScan.close();
		

	}
/**
 * Create a method with two formal parameters: a String object and a char. 
 * Call this method "countChars." This method should count how many times the 
 * char shows up in the String and return that number.
 * @param x, y 
 */
private static void countChars(String x, char y) 
	{
		//count variable
		int z = 0; 
		
		//for loop to run for each letter of the word
		for(int i = 0; i < x.length(); i++)
		{
			//if character at i = y then add one to the count 
			if( x.charAt(i) == y)
			{
				z++;
			}
				
		}
		//final count is the total amount of times the user's letter shows up
		int finalcount = z;
		
		//Print out result 
		System.out.print(finalcount);
		
		
		
	}
/**
 * 
 * Make a line that prints an int between 1 and 17 inclusive 
 * Roll 200 times
 */

	private static void roll200() 
	{
		//Create a for loop that will roll 200 times
				for(int i = 1; i <= 200; i++)
				{
				//Multiply by 17 to get the random generator 
			    //Add by 1 to make it start from 1 rather than 0
				 int x = (int)(Math.random() * 17 + 1);
				
				 //Print out result of roll
				 System.out.println(x);

				}
				
	}

}
