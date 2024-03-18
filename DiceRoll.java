import java.util.Scanner;

/**
 * Take in user's input and print the dice result 
 * @author Jubes
 */
public class DiceTuts 
{

	public static void main(String[] args) 
	{
		//import scanner to take in user's input
		Scanner diceTaker = new Scanner(System.in);
		
		//take in user's input
		String fullPhrase = diceTaker.nextLine();
			
		//Takes in string and create a method
		rollDice(String fullPhrase);
		
		
		//close scanner 
		diceTaker.close();
	}

	/**
	 * Create a method that splits the num of dice and what dice into ints and
  	 * uses the num of dice and which dice int to create 
	 * a for loop that rolls the dice and adds them together 
	 * Print result
	 * @param j
	 * @param k
	 */
	//private static int rollDice(int j, int k) 
	private static void rollDice(String fullPhrase)
	{
		//find the d 
		char d = 'd';
		int input = fullPhrase.indexOf(d);
			
		//Get the inputs 
		String numOfDice = fullPhrase.substring(0, input);
		String whatDice = fullPhrase.substring(input + 1, fullPhrase.length());
		
		int j = Integer.parseInt(numOfDice);
		int k = Integer.parseInt(whatDice);
		
		//declare an int as the starting point 
		int result = 0;
		
		//Create a for loop that will add the results together 
		for(int i = 1; i <= j; i++)
		{
			//create an int that will be the rolls 
			int roll = (int)(Math.random() * k + 1);
			System.out.println(roll);
			//add up the rolls 
			result += roll;
		}
	
		//return result;

		//test
		System.out.println("You rolled " + j + " " + k + "-sided dice " + ". You deal "
				+ result + " damage.");
	}

}
