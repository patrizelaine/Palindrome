package project;

/*
 * Name: Patriz Elaine Daroy
 * Bronco ID Number: 012590838
 * Sources of Help: Serena Ing
 */

import java.util.Scanner;

public class Palindrome {
	public static void main (String [] args) {	//main method
		Scanner scan = new Scanner(System.in);	//defining scanner
		int length;	//variable for the user input's length
		String caseCheck = "";	//string yes or no variable to see if case should be ignored
		String input = "";	//string variable for user input for the input to be tested
		String repeat = "";	//string variable to see if user wants to test another word for palindrome
	  
		do {		//do-while loop
			System.out.println("Do you want to ignore case?");	//asks user if they want to ignore case
			caseCheck = scan.nextLine();		//gets user yes/no input to check case
	     
		     System.out.println("Enter a word to test as a palindrome: ");	//asks user for palindrome to test
		     input = scan.nextLine();	//gets user input to test palindrome
		     length = input.length();	//initializes length to input length
		     
		     String reverse = "";		//string variable to store string variable of the input word in reverse
		     
		     //IGNORING CASE
		     if(caseCheck.equalsIgnoreCase("Yes")) {	//if-statement if user wants to ignore case
		    	 	for (int i = length - 1; i >= 0; i--)	//reverses the input
		 	        reverse = reverse + input.charAt(i);
		    	 		if (input.equalsIgnoreCase(reverse))	//if a palindrome
		    	 			System.out.println (input + " is a palindrome.");
		    	 		else //if not a palindrome
		    	 			System.out.println (input + " is not a palindrome.");
		     }
		     
		     //DON'T IGNORE CASE
		     if (caseCheck.equalsIgnoreCase("No")) {	//if-statement if user does NOT want to ignore case
		    	 	for (int i = length - 1; i >= 0; i--)	//reverses the input
		    	 		reverse = reverse + input.charAt(i);
			    	 	if (input.equals(reverse))	//if a palindrome
			    	 		System.out.println (input + " is a palindrome.");
			    	 	else //if not a palindrome
			    	 		System.out.println (input + " is not a palindrome.");
		     }

	     System.out.println ("Do you want to try again? Yes (y) or No (n)"); 	//asks user if they want to run another test
	     repeat = scan.nextLine();	//gets user input to run another test or not
		}	while(repeat.equalsIgnoreCase ("Yes") || repeat.equalsIgnoreCase("Y"));	//runs the do-while loop as long as user inputs "yes" to running another test
		
		System.out.println("Thanks for playing!");	//program says "thanks for playing!" when program ends
		scan.close();	//closes scanner
	} //end main method
}	
