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
		
		String noSpaces = new String("");
		String afterSpace = new String("");
		String result = new String("");

		int i;
		for(i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == ' ')
			{
				noSpaces = noSpaces.concat(phrase.substring(0, i));
				afterSpace = noSpaces.concat(phrase.substring(i + 1, i + 1));
				System.out.println(noSpaces);
				System.out.println(afterSpace);
			
			
								
			
			}
			 System.out.println(phrase.substring(i));
		}
		
		
		System.out.println(noSpaces + afterSpace)
		
		
		
		
		
		
	}

}
