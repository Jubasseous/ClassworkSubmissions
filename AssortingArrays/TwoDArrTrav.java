package Classwork;

public class TwoDArrTrav 
{

	public static void main(String[] args) 
	{
		//declare a 2D array
		String [][] names = new String[3][2];
		
		//add elements to the array
		String [][] names1 = {{"Chambers", "Sensei"},
				 			  {"Yangson", "Trauger"},
				 			  {"Higa", "Limos"}};
		//fill them all in
		String [][] names2 = new String[7][6];
		
		//set all elements to a 
		for(int i = 0; i < names2.length; i++)
		{
			for(int j = 0; j < names2[6].length; j++)
			{
				names2[i][j] = "a";
			}
		}
		
		//print to check (I guess this is task 6)
		printArr(names2);
		
		
		System.out.println(names2[0][0]);
		System.out.println(names2[1][0]);
		
		//print the first element in each row
		//Traversing the array in column-major order
		for(int i = 0; i < names2.length; i++)
		{
			System.out.print(names2[i][0]);
		}
		
		System.out.println(" ");
		
		//print out the elements in the first row
		for(int i = 0; i < names2[6].length; i++)
		{
			System.out.print(names2[0][i]);
		}
			
				
 	}
	
	/**
	 * This method is to print out each element of the array
	 * Task 6
	 * @param nums
	 */
	private static void printArr(String[][] words) {
		//for loop to traverse the array
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[6].length; j++)
			{
				//print out each element
				System.out.print(words[i][j]);
			}
			
			System.out.println(" ");

			
		}
		
	}

}
