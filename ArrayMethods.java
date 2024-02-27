package Classwork;

/**
 * Classwork for arrays
 * @author Jubes
 */

public class ArrayWork 
{

	public static void main(String[] args) 
	{
		
		int[] arr1 = {44,31,30,45,20,14, 7};
		// Task 1: Create a method divideElementByTwo that is passed an
		//int array arr and an int n, and the method will change arr such
		//that its n'th element is divided by two.
		divideElementByTwo(arr1, 3);
		
		//For example, if you have an array evens {2, 4, 6, 8, 10, 12} and you execute: 
		//divideElementByTwo( evens, 4 ) then evens should now be equal to
		//{2, 4, 6, 8, 5, 12}
		System.out.println(divideElementByTwo(arr1, 2));

		// Task 2:  Create a method giveFirstAndLastArray that if passed an array, 
		//will return an array consisting of ONLY the first and last two elements. 
		
		giveFirstLastArray(arr1);
		//For example, if you have an array evens {2, 4, 6, 8, 10, 12} and you execute: 
				//giveFirstAndLastArray( evens ) then the method will return {2, 12}
		
	
	}
	
	/**
	 * This method will change arr such that its n'th element is divided by two.
	 * @param arr
	 * @return
	 */

	private static int[] giveFirstLastArray(int[] arr) {
		
		//make a new int equal to the first and last elements of the passed array
		int[] newArr = {arr[0], arr[arr.length - 1]};
		
		//return array
		return newArr;
		
	}
	
	/**
	 * This method will return an array consisting of ONLY the first and last two elements. 
	 * @param arr
	 * @param n
	 * @return
	 */

	private static int divideElementByTwo(int[] arr, int n) 
	{
		//make the n'th element divided by two 
		arr[n] /= 2;
		//return
		return arr[n];
	}

}
