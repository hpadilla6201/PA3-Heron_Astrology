package edu.wit.cs.comp1000;
import java.util.Scanner;
/*
 * Program for Heron Calculations
 * @author Hector Padilla
 * @date 9/29/2019
 */
//TODO: document this class
public class PA3a {
	private static Scanner scnr;
	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter the length of side a: ");
		scnr = new Scanner(System.in);
		double a = scnr.nextDouble();
		
		System.out.print("Enter the length of side b: ");
		double b = scnr.nextDouble();
		
		System.out.print("Enter the length of side c: ");
		double c = scnr.nextDouble();
		
		

		if ( (a < 0) || (b < 0) || (c < 0) ) {
			System.out.println("Side lengths must all be positive");
			System.exit(0);
		}
		
		
		if (a > (b + c)) {
			System.out.println("Side a is too long");
			System.exit(0);
		} 
		if (b > (a + c)) {
			System.out.println("Side b is too long");
			System.exit(0);
		}
		if (c > (b + a)) {
			System.out.println("Side c is too long");
			System.exit(0);
		}
		
		
		
		
		double s  = (a + b + c)/2;
		
		double x = ((s) * (s-a) * (s-b) * (s-c));
		
		double area = Math.sqrt(x);
		System.out.printf("The area is %.2f%n", area);
		
		
	}

}
/*
Enter the length of side a: 3
Enter the length of side b: 4
Enter the length of side c: 5
The area is 6.00
*/
