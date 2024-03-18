import java.util.Scanner;

/**
 * Will create a method that will take in a string and return
 * the string with no spaces by concat method 
 * @author Jubes
 */
public class Concat 
{

	public static void main(String[] args) 
	{
		//Instantiate a scanner 
		Scanner userIn = new Scanner(System.in);
		
		//Create a string that takes in the user's input
		String phrase = userIn.nextLine();
		
		System.out.println(noSpaces(phrase));
		
		//Close scanner 
		userIn.close();

	}
	/** 
	 * Create a method that will take in string and return it 
	 * without spaces 
	 * @param phrase
	 */

	private static String noSpaces(String phrase) 
	{
		//Create a new string that will take in the phrase and remove the spaces
		String noSpaces = new String("");
		//Create an int that will keep track of where the spaces are
		int spaces = 0;
		
		//Create a for loop that will check every character to see if there is a space
		for(int i = 0; i < phrase.length(); i++)
		{
			//if statement to  check if the character is a space
			if(phrase.charAt(i) == ' ')
			{
				
				//if there's a space, concatenate from the bringing which is space to where the 
				//space is at
				noSpaces = noSpaces.concat(phrase.substring(spaces + 1, i));
				//make the spaces equal to i so that it knows to start from the last space
				spaces = i;
				
			}
			
		}
		
		//Make the string equal to the first character of the space + the edited phrase + the last character
		noSpaces = String.valueOf(phrase.charAt(0)).concat(noSpaces).concat(phrase.substring(spaces + 1));
		
		//return the edited
		return noSpaces;
		
		
		
		
	}

}
