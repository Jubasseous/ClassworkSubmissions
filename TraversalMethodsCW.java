package Arrays;
/**
 * Traversal methods classwork
 * @author Jubes
 */
public class SumArrTraversalClasswork 
{

	public static void main(String[] args) 
	{
		//declare a double array
		double[] nums = {3.4, 5.4, 6.8, 7.8, 3.0, 4.1};
		
		//declare an int array
		int[] nums1 = {2, 3, 4, 5, 6,};
		
		//create method to get the sum of the array
		System.out.println(sumArrElements( nums ));
		
		//create method that will change the every other element to one
		makeEveryOtherOne( nums1 );
	

	
	}
	/**
	 * Create a method makeEveryOtherOne that is passed an array of 
	 * ints and changes that array. It should make every other element 
	 * in the array '1' starting with the second element.  
	 */
	private static void makeEveryOtherOne(int[] arr) 
	{
		//create a for loop to traverse every other element
		for( int i = 1; i < arr.length; i+= 2)
		{
			//set the arr at i = 1
			arr[i] = 1;
		}
		
		//check if method works 
		
		//braces to look like array
		System.out.print("{");
		//for loop to traverse
		for( int traverser = 0; traverser < arr.length; traverser++)
		{
			//print out the element at traverser
			System.out.print(arr[traverser]);
			//check if there should be a comma
			if(traverser != arr.length - 1)
			{
				System.out.print(", ");
			}
			
		}
		//braces to look like array
		System.out.print(" }");
		
		
	}

	/**
	 * Create a method sumArrElements that is passed an array of
	 * doubles and returns the sum of all its elements. 
	 * For example, when the method is passed 
	 * @param arr
	 * @return
	 */
	private static double sumArrElements (double[] arr)
	{
		//declare a double that will be the total
		double total = 0; 
		
		//for loop to traverse the array
		for( int i = 0; i < arr.length; i++)
		{
			//set the total plus equal to each element traversed
			total += arr[i];
		}
		
		//return total
		return total;

	}
		

}
