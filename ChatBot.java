package Classwork;

import java.util.Scanner;

/**
 * Recursion is the idea that a method can be passed to itself, 
 * making the method run again. Let that sink in (bask), and then 
 * complete the following tasks
 */
public class ChatBot 
{

	public static void main(String[] args) 
	{
		//call a method
		stupidNameSayer();
	}
	
	/**
	 * Allow the user to guess a number, but if it's not the right one
	 * Print out that it itsn't and give another try
	 */
	public static void stupidNameSayer()
	{
		
		//import Scanner
		Scanner takeNum = new Scanner(System.in);
		
		//Declare in Int to be the guessed number
		Integer guessNum = takeNum.nextInt();
		
		//check if the guessed number is 69
		if(guessNum == 69)
		{
			//print if its  good num
			System.out.println("That's a really good number");
		}
		//else if not try again
		else
		{
			//print that it's not a good number
			System.out.println("That's a stupid number! Try again!");
			//recursion to give another guess
			stupidNameSayer();
		}
		
		
		takeNum.close();
	}

}
