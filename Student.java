/**
 * Create a Student class that is meant to store the grades of a student.
 * 
 *  create three attriubutes: scienceGrade, mathGrade, theologyGrade,
 * a constructor,
 * and some methods.
 * 
 * @author Jubes
 */
public class Student 
{
	//list the properities/data attributes
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	private int gradeLevel;
	String studentName = new String ();
	
	/**
	 * This constructor lets us make Student objects.
	 * We pass it numbers to be the initial values
	 * for the data attributes. 
	 * @param a 
	 * @param b
	 * @param c
	 */
	public Student(double a, double b, double c, int d, String e)
	{
		scienceGrade = a;
		mathGrade = b;
		theologyGrade = c;
		gradeLevel = d;
		studentName = e;
	}
	
	/**
	 * Create a method that returns the average of all grade values 
	 * 
	 * @return GPA = Average GPA
	 */
	
	public double getGPA()
	{
		double GPA = (scienceGrade + mathGrade + theologyGrade) / 3;
		
		return GPA;
	}
	
	/**
	 * Create a method that will introduce the student based on the
	 * attributes
	 */
	public void introduceSelf()
	{
		System.out.println("I am a student in grade " + gradeLevel
				+ ".\n" + "My name is " + studentName + ".\n"
				+ "My average GPA is " + getGPA());
	}
	
}
