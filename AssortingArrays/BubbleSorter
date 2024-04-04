package Classwork;

public class BubbleSorter {

	public static void main(String[] args) {
		
		//declare an int array
		int[] nums = makeRandom();
		
		//create a method to sort the array
		bubbleSort(nums);
		
		//check
		printArr(nums);

	}
	
	/**
	 * This method is to print out each element of the array
	 * @param nums
	 */
	private static void printArr(int[] nums) {
		//for loop to traverse the array
		for(int i = 0; i < nums.length; i++)
		{
			//print out each element
			System.out.println(nums[i]);
		}
		
	}

	/**
	 * The method should be passed the array, and return a totally
	 * new one that is a sorted version of the original.
	 * @param nums
	 * @return
	 */
	private static int[] bubbleSort(int[] nums)
	{
		//for loop to traverse the array and makes sure that the for loop within runs for 
		//each element 
		for( int i = 0; i < nums.length; i++)
		{
			//for loop that will check an element and swap if the
			//element before is greater. This will get the element in the right order,
			//but will stop before the length minus i 
			for(int j = 1; j < nums.length - i; j++)
				
			{
				//checks if the element at j is less than the element before
				if( nums[j] < nums[j-1])
				{
					//declare a temp to be the element before j
					int temp = nums[j-1];
					//Switches the element before with the element at j 
					nums[j-1] = nums[j];
					//makes the element at j equal to the element before 
					nums[j] = temp;
				}
				
			}
		}
		
		return nums;
	}
	/**
	 * This method will make an array that has 2000 elements
	 * and will set each element of the array to a random number between
	 * 1 and 1000
	 * @return
	 */
	private static int[] makeRandom() 
	{
		//declares an array to have a total of 2000 elements
		int[] bigNums = new int[2000];
		
		//declares an int to be the length of bigNums (2000)
		int len = bigNums.length;
		
		//Create a for loop which will traverse the array
		for (int i = 0; i < len; i++)
		{
			//declare an int to be a random number of 1000 except 0
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			//Set the element at i equal to the random number
			bigNums[i] = randomNumber;
			
		}
		
		//return the array
		return bigNums;
		
	}
}
