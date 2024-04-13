package Classwork;

//import array list
import java.util.ArrayList;

/**
 * Make a new class ArrayListIntro and generate a main method. 
 * @author Jubes
 */
public class ArrayListIntro 
{

	public static void main(String[] args) 
	{
		//Create an empty ArrayList studentNames of Strings
		ArrayList<String> studentNames = new ArrayList<String>();
		
		// Add the following String literals to studentNames: "Alice" = Keanu, 
		//"Charlie" = Kyla, "Dave" = Trauger, "Elizabeth" = Yangson, "Fieri" = Higa,
		//"Gwen" = Sensei. The ArrayList should hold them in this order. 
		//Print the ArrayList to make sure it is organized correctly.
		studentNames.add("Keanu");
		studentNames.add("Kyla");
		studentNames.add("Trauger");
		studentNames.add("Yangson");
		studentNames.add("Higa");
		studentNames.add("Sensei");
		
		//check
		System.out.println(studentNames);
		
		//Now add "Brittany" = Jubes directly after "Alice." Keanu
		studentNames.add(1, "Jubes");
		
		//Charlie (Kyla) got expelled. Remove her from the ArrayList. 
		studentNames.remove(2);
		
		// I forgot who is at the 2 index. 
		//Please get the value of the String literal at index 2 and then print studentNames.
		System.out.println(studentNames.get(2));
		System.out.println(studentNames);
		
		//Elizabeth had a name change.
		//Set the value of the String literal where "Elizabeth" is to "Evan".
		studentNames.set(3, "Blythe");
		
		System.out.println(studentNames);
		
		
	}

}
