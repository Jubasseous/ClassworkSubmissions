package Classwork;

/**
 * Make a class called InsertionSorter with a main method. 
 * You'll use it to call the methods you make in order to test they work.
 * @author Jubes
 */
public class InsertionSorter 
{
	public static void main(String[] args) 
	{
		//declare an array
		int[] arr1 = {2,5,7,10,3};
		//Create a method; Task 1
		arrayShifter(arr1);
		
		//new array
		int[] arr2 = {2, 4, 6, 8, 5, 10, 12};
		//Update the old method; Task 2
		arrayShifter(arr2, 4);		

		//new array
		int[] arr3 = {2,5,7,10,3,8,9};
		insertionSort(arr3);
		
		//Print elements
		printArr(arr3);
	}
	
	/**
	 * Create a method insertionSort (that is passed an int array)
	 *  with a for loop that traverses the array from left to right. 
	 *  On each iteration of the loop (in the work) write code that 
	 *  calls the arrayShifter method and passes it the array and the 
	 *  current loop index.
	 * @param arr3
	 */
	private static void insertionSort(int[] arr) 
	{
		//for loop to traverse the array from left to right
		for(int traverser = 0; traverser < arr.length; traverser++)
		{
			arrayShifter(arr,traverser);
		}
		
	}


	/**
	 *  Change the previous method so that it is passed an int 
	 *  index and will sort the value at that index instead of the last index. 
	 *  (Precondition: the rest of the array will be sorted)
	 * @param arr2
	 * @param i
	 */
	private static void arrayShifter(int[] arr, int index) 
	{
		//declare a variable equal to the length - 1 so that it is not out of bounds
		int last = arr[index];
				
		//for loop to traverse the array and make sure everything is sorted 
		for(int i = index - 1; i >= 0; i--)
		{
			//check if the element at index is less than the element before
			if(last < arr[i])
				{
					
					//Swap elements
					arr[i + 1] = arr[i];
					arr[i] = last;
				
					//works, but is step by step and not optimized
					arr[index] = arr[i];
					arr[i] = last;
					index--;
					last = arr[i];
					
					
				}
				
		}
	}

	/**
	 * This method prints out the elements of the array
	 * @param arr1
	 */
	private static void printArr(int[] arr) 
	{
		//Enhanced for loop to print each element
		for(int elementCopy: arr)
		{
			System.out.print(elementCopy + " ");
		}
		
	}

	/**
	 * Create a method arrayShifter that when passed an array of ints, 
	 * will take the last element and sort it into the right place. 
	 * (Precondition: The array will be sorted except for the last element.)
	 * @param arr1
	 */
	private static void arrayShifter(int[] arr)
	{
		//declare a variable equal to the length - 1 so that it is not out of bounds
		int length = arr.length - 1;
		
		//for loop to traverse the array and make sure everything is sorted 
		for(int traverser = 0; traverser < arr.length - 1; traverser++)
		{
			//individually sort each element
			while(length > 0 && arr[length] < arr[length - 1])
			{
				//Swap elements
				int temp = arr[length - 1];
				arr[length - 1] = arr[length];
				arr[length] = temp;
				
				//minus 1 length so that it sorts the element correctly
				length--;
				
			}
		}
			
		
	}

}
