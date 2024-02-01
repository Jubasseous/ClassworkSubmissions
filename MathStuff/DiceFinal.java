import java.util.Scanner;

/**
 * Take in user's input and print the dice result 
 * @author Jubes
 */
public class DiceFinal 
{

	public static void main(String[] args) 
	{
		//import scanner to take in user's input
				Scanner diceTaker = new Scanner(System.in);
				
				//take in user's input
				String fullPhrase = diceTaker.nextLine();
			
				//remove the spaces
				String noSpaces = removeSpaces(fullPhrase);
				
				//create a method that will split 
				totalDice(noSpaces);
				
				
				//close scanner
				diceTaker.close();
				
	}
	/**
	 * This method will produce the final roll along with explaining which dice is
	 * being rolled 
	 * @param roll
	 */
	
	private static void totalDice(String roll) 
	{
		//declare the amount of dice set to how many dice are being rolled plus 1 
		int dice = countDice(roll) + 1;
		
		//declare an int to be how many times d shows up
		int d = roll.indexOf('d');
		//declare an int to be how many times + shows up
		int plus = roll.indexOf('+');
		
		//declare an int for the total sum of everything
		int total = 0;
		
		//create a for loop that checks every dice
		for(int i = 0; i < dice; i++)  
		{
	
			//checks if there's multiple dice and multiple plus signs 
			if (d > 0 && plus > 0)
			{
			
				//declares the count start from the number to the d
				int count = Integer.valueOf(roll.substring(0, d)) ;
			
				//declares the faces start after the d to the plus
				int faces = Integer.valueOf(roll.substring(d+1, plus)) ;
			
				//sets the total to what dice is being rolled
				total += rollDice(count, faces) ;
			
				//sets the next dice roll to start after the plus
				roll = roll.substring(plus+1) ;
			
				//Print which dice and how many are being rolled
				System.out.print(count + " " + faces + "-sided dice, and ") ;
			
				//System.out.print(total);
			}

			//check if there's another dice, but no plus sign following 
			else if (d > 0 && plus == -1) 
			{
				//declares the count start from the number to the d
				int count = Integer.valueOf(roll.substring(0, d)) ;
				
				//declares the faces start after the d to the plus
				int faces = Integer.valueOf(roll.substring(d+1)) ;
			
				//adds to the total by what dice is being rolled
				total += rollDice(count, faces) ; 
			
				//sets the next dice roll to start after the plus
				roll = "";
				
				//roll = roll.substring(plus+1) ;
				
				
				//Print which dice and how many are being rolled
				System.out.println(count + " " + faces + "-sided dice.");
			
				//System.out.print(total);
			}
			//checks for the modifier
			else  
			{
				//declares a modifier equal to integer left over
				int modifier = Integer.valueOf(roll);
			
				//adds the modifier to the total
				total += modifier;
			
				//print out the modifier
				System.out.println("You added" + modifier);
				
			}	
			
		}
		
		//Print total 
		System.out.println("Your total roll is "+  total);
		
		
	}

	/**
	 * This method checks how many dice there are 
	 * @param roll
	 * @return
	 */
			
	private static int countDice(String roll) 
	{
		//declare a int for the number of times plus shows up
		int count = 0;
				
		//create a for loop that will check where there's a plus sign
		for(int i = 0; i < roll.length(); i++)
			{
				//check if the character is a plus
				if(roll.charAt(i) == '+')
				{
					//add to the count to create the length 
					count++;
				}
			}
				
		//return the number of dice being rolled	
		return count;

	}
	/**
	 * Create a method that uses the num of dice and which dice int to create 
	 * a for loop that rolls the dice and adds them together 
	 * Print result
	 * @param count
	 * @param faces
	 */
	private static int rollDice(int count, int faces) 
	{
		//declare an int as the starting point 
		int result = 0;
				
				
		//Create a for loop that will add the results together 
		for(int i = 1; i <= count; i++)
		{
			//create an int that will be the rolls 
			int roll = (int)(Math.random() * faces + 1);
			
			//System.out.println(roll);
			//add up the rolls 
			result += roll;
				}
		
		return result;
	}

	/** 
	 * Create a method that will take in string and return it 
	 * without spaces 
	 * @param phrase
	 */
	private static String removeSpaces(String phrase) 
	{
		//Create a new string that will take in the phrase and remove the spaces
		String noSpaces = new String("");
				
		//Declare an int that will keep track of where the spaces are
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
