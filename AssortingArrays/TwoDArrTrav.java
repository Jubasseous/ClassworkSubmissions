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
		
		//Task 1
		print2DArr(names2);
		
		//Declare a 2D array
		double [][]  sArr = new double[7][6];
		
		//task 2
		printArr(allOnes2D(sArr));
			
				
 	}
	/**
	 * Print double array
	 * @param arr
	 */
	private static void printArr(double [][] arr)
	{
		//for loop to traverse the array
		for(int i = 0; i < arr[6].length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				//print out each element
				System.out.print(arr[j][i]);
			}
					
			System.out.println(" ");
		
		}
	}
	
	/**
	 * Create a method allOnes2D() that is passed a 2D double array, 
	 * makes an array of the same column and row length but all its literals are 
	 * 0.0 called copyArr, and then changes each element inside to 1.0 and returns copyArr. 
	 * (So it is passed a 2D array and returns a 2D array with all 0.0).
	 * @param arr
	 */
	
	private static double [][] allOnes2D(double [][] arr)
	{
		double [][] copyArr = new double[arr.length][arr[0].length];
		
		for(int r = 0; r < copyArr.length; r++)
		{
			for(int c = 0; c < copyArr[0].length; c++)
			{
				copyArr[r][c] = 1.0;
			}
						
	
		}
		
		return copyArr;
		
	}
	/**
	 * This method is to print out each element of the array
	 * Task 6
	 * @param arr
	 */
	private static void printArr(String [][] arr)
	{
		//for loop to traverse the array
		for(int i = 0; i < arr[6].length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				//print out each element
				System.out.print(arr[j][i]);
			}
					
			System.out.println(" ");
		
		}
	}
	
	/**
	 * Create a method print2DArray() that is passed a 2D String array 
	 * and will print out each element in row-major order (instead of 
	 * column-major order like we did yesterday). 
	 * @param words
	 */
	private static void print2DArr(String[][] words) {
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
