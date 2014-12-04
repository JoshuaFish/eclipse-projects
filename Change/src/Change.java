/**
 * Author - Joshua Fish, 04/12/2014
 * Version - 1.0
 * To do - Add GUI with options for other currencies
 * 		 - Look to improve in any way
 */

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {

		int provided;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount.");
		provided = (int) Math.round(input.nextDouble() * 100);
		input.close();

		//If > 0 will output 0 of this value currency
		//Resets value of provided to remainder after previous currency amount has been calculated, 
		//has to at least have been at least 1 of previous currency output 
		int twenties = provided / 2000;
		if (twenties > 0) {  
			provided = provided % 2000; 						
			System.out.println(twenties + " £20 note(s)");
		}
		int tens = provided / 1000;
		if (tens > 0) {
			provided = provided % 1000;
			System.out.println(tens + " £10 note(s)");
		}
		int fives = provided / 500;
		if (fives > 0) {
			provided = provided % 500;
			System.out.println(fives + " £5 note(s)");
		}
		int twos = provided / 200;
		if(twos > 0) {
			provided = provided % 200;
			System.out.println(twos + " £2 coin(s)");
		}
		int ones = provided / 100;
		if (ones > 0) {
			provided = provided % 100;
			System.out.println(ones + " £1 coin(s)");
		}
		int fiftyPence = provided / 50;
		if (fiftyPence > 0) {
			provided = provided % 50;
			System.out.println(fiftyPence + " 50 pence coin(s)");
		}
		int twentyPence = provided / 20;
		if (twentyPence > 0) {
			provided = provided % 20;
			System.out.println(twentyPence + " 20 pence coin(s)");
		}
		int tenPence = provided / 10;
		if (tenPence > 0) {
			provided = provided % 10;
			System.out.println(tenPence + " 10 pence coin(s)");
		}
		int fivePence = provided / 5;
		if (fivePence > 0) {
			provided = provided % 5;
			System.out.println(fivePence + " 5 pence coin(s)");
		}
		int twoPence = provided / 2;
		if (twoPence > 0) {
			provided = provided % 2;
			System.out.println(twoPence + " 2 pence coin(s)");
		}
		if (provided > 0) {
			System.out.println(provided + " 1 pence coin(s)");
		}
	}
}
