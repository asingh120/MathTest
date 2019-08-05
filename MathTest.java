/* Exercise 7 on page 226
	
	Filename: MathTest.jave
	Author: Amit
	Date: 8/1/19

	Application to determine various mathematical equations */


public class MathTest
{
	public static void main(String[] args)
	{
		// Variables and constants
		double a = 37;
		double b = 300;
		double c = 22.8;
		char D;
		int e = 71;
		int x = Character.getNumericValue('D');

		// Calculation and output phase
		System.out.println("The square root of " + a + " is: " + Math.sqrt(a));
		System.out.println("The Sine of " + b + " is: " + Math.sin(b));
		System.out.println("The Cosine of " + b + " is: " +Math.cos(b));
		System.out.println("The value of the floor of " + c + " is: " + Math.floor(c));
		System.out.println("The value of the ceiling of " + c + " is: " + Math.ceil(c));
		System.out.println("The value of a round of " + c + " is: " + Math.round(c));
		System.out.println("The numeric value of Char 'D' is: " + x + ". The value of an integer e is: " + e + ". The larger of these two values is an integer e, or " + e + ".");
		System.out.println("A random number between 0 and 20 is " + (Math.random() * 20));

	}
}