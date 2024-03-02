package Classwork;

/**
 * This class will have a method that is passed an array of doubles nums and an int n. 
 * The method should print out the number before and after the n'th element.
 */
public class PrintPrevNextElement 
{

	public static void main(String[] args) 
	{
		
		double[] arr = {4.4, 3.2, 3.1, 4.0, 5.0, 7.0};
		int n = 4;
		
		//Create a method that's passed an array
		printPrevNextElement(arr, n);

	}
	
	/**
	 * Make a method that is passed an array of doubles nums and an int n.
	 *  The method should print out the number before and after the n'th element.
	 *  @param n
	 *  @param arr
	 */
	
	public static void printPrevNextElement(double[] arr, int n)
	{
		//Create a print statement that will tell the user the element before and after the index
		System.out.println(" The number before the element at index " + n + " is "
				+ arr[n - 1] + " and the number after the element at index "
				+ n + " is " + arr[n + 1] + ".");
	}

}
