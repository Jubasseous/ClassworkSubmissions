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
		
		//character for how many times loop will run
		char numOfTimesRan = '+'; 
		
		//create a for loop that will run a number of times based on how many + 
		//there are minus the last one for the modifier
		//Using a method to find how many plus signs there are
			
		//if(findPlus(fullPhrase, numOfTimesRan) = 1)
		{
			for(int i = 1; i < (findPlus(fullPhrase, numOfTimesRan)); i++)
				{
					
					
				}
		}	
		//find the d 
		char d = 'd';
		int input = fullPhrase.indexOf(d);
			
		//Get the inputs 
		String numOfDice = fullPhrase.substring(0, input);
		String whatDice = fullPhrase.substring(input + 1, fullPhrase.length());
			
		//Set strings as ints and create a method
		rollDice(Integer.parseInt(numOfDice), Integer.parseInt(whatDice));
		
		
		//close scanner 
		diceTaker.close();
	}

	/**
	 * Create a method with two formal parameters: a String object and a char. 
	 * This method should count how many times the char shows up in the String 
	 * and return that number.
	 * @param fullPhrase
	 * @param numOfTimesRan
	 * @return 
	 */
	private static int findPlus(String fullPhrase, char numOfTimesRan) 
	{
		//count variable 
		int z = 0;
		
		for(int i = 1; i < fullPhrase.length(); i++)
		{
			if(fullPhrase.charAt(i) == numOfTimesRan)
			{
				z++;
			}
		}
		int loop = z;
		
		return loop;
		
	}
	
	/**
	 * Create a method that uses the num of dice and which dice int to create 
	 * a for loop that rolls the dice and adds them together 
	 * Print result
	 * @param j
	 * @param k
	 */
	//private static int rollDice(int j, int k) 
	private static void rollDice(int j, int k)
	{
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
