package edu.wit.cs.comp1000;
/*
 * Finding out your astrology program 
 * @author Hector Padilla
 * @date 9/27/2019 
 */
import java.util.Scanner;
//TODO: document this class
public class PA3b {
	private static Scanner scnr;
	
	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		
		System.out.print("Enter your birth month (1-12): ");
		scnr = new Scanner(System.in);
		int bMonth = scnr.nextInt();
		
		System.out.print("Enter your birth day (1-31): ");
		int bDay = scnr.nextInt();
		
		if ((bMonth >= 13) ||(bMonth <= 0)) {
			System.out.println("Month must be between 1 and 12!");
			System.exit(0);
		}
		if ((bDay >= 31) || (bDay <= 0)) {
			System.out.println("Day must be between 1 and 31!");
			System.exit(0);
		}
		if (((bMonth == 3) && (bDay >= 21)) || ((bMonth == 4) && (bDay <= 19))) {
			System.out.println("You are an Aries!");
			System.out.println("You are agressive");
		}
		else if (((bMonth == 4) && (bDay >= 20)) || ((bMonth == 5) && (bDay <= 20))) {
			System.out.println("You are a Taurus!");
			System.out.println("You have good taste");
		}
		else if (((bMonth == 5) && (bDay >= 21)) || ((bMonth == 6) && (bDay <= 21))) {
			System.out.println("You are a Gemini!");
			System.out.println("You have a good sense of humor");
		}
		else if (((bMonth == 6) && (bDay >= 22)) || ((bMonth == 7) && (bDay <= 22))) {
			System.out.println("You are a Cancer!");
			System.out.println("You are emoitional");
		}
		else if (((bMonth == 7) && (bDay >= 23)) || ((bMonth == 8) && (bDay <= 22))) {
			System.out.println("You are a Leo!");
			System.out.println("You are passionate");
		}
		else if (((bMonth == 8) && (bDay >= 23)) || ((bMonth == 9) && (bDay <= 22))) {
			System.out.println("You are a Virgo!");
			System.out.println("You love cleaning");
		}
		else if (((bMonth == 9) && (bDay >= 23)) || ((bMonth == 10) && (bDay <= 22))) {
			System.out.println("You are a Libra!");
			System.out.println("You are crazy");
		}
		else if (((bMonth == 10) && (bDay >= 23)) || ((bMonth == 11) && (bDay <= 21))) {
			System.out.println("You are a Scorpio!");
			System.out.println("You are strong");
		}
		else if (((bMonth == 11) && (bDay >= 22)) || ((bMonth == 12) && (bDay <= 21))) {
			System.out.println("You are a Sagittarius!");
			System.out.println("You love Gemini's");
		}
		else if (((bMonth == 12) && (bDay >= 22)) || ((bMonth == 1) && (bDay <= 19))) {
			System.out.println("You are a Capricorn!");
			System.out.println("You might be named Britney");
		}
		else if (((bMonth == 1) && (bDay >= 20)) || ((bMonth == 2) && (bDay <= 18))) {
			System.out.println("You are an Aquarius!");
			System.out.println("You are exciting");
		}
		else if (((bMonth == 2) && (bDay >= 19)) || ((bMonth == 3) && (bDay <= 20))) {
			System.out.println("You are a Pisces!");
			System.out.println("You are thoughtful");
		}
	}
}
//Enter your birth month (1-12): 9
	//Enter your birth day (1-31): 26
	//You are a Libra!
	//Tony Stark will buy out your business.
