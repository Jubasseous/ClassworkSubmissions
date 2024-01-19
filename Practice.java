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
		
		noSpaces(phrase);
		
		//Close scanner 
		userIn.close();

	}
	/**
	 * Create a method that will take in string and return it 
	 * without spaces 
	 * @param phrase
	 */

	private static void noSpaces(String phrase) 
	{
		int space = 0;
		String noSpaces = " ";
		
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == ' ')
			{
				noSpaces = noSpaces.concat(phrase.substring(space, i));
				
			}
			space = i;	
		}
		System.out.print(noSpaces);
		
		
		
		
		
	}

}
