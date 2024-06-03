package practice;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// MINI PROJECT

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * int myNumber = (int)(Math.random()*100); int userNumber = 0;
		 * 
		 * do {
		 * 
		 * System.out.println("Guess my number (1 - 100) : "); userNumber =
		 * sc.nextInt();
		 * 
		 * if (userNumber == myNumber ) {
		 * System.out.println("WOOHOO! CORRECT NUMBER !!!"); break; }
		 * 
		 * else if (userNumber > myNumber) {
		 * System.out.println("Your number is too large."); } else {
		 * System.out.println("Your number is too small."); } } while (userNumber >= 0);
		 * System.out.print("My number was : "); System.out.println(myNumber);
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("What is  the size of the array you want : ");
		int size = sc.nextInt();
		
		System.out.println("Note down the numbers that you want to store.");
		int numbers[] = new int[size];
		
		// input

		for (int i = 0; i < size; i++) {

			numbers[i] = sc.nextInt();
		}
		
		System.out.println("write down the value of x that you would like to find the index.");
		int x = sc.nextInt();		
		
		//output
		System.out.println("Here are your stored datas.");
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
			
			if (numbers[i] == x ) {
				System.out.println("x found at index : " + i);
			}
		}

		sc.close();
	}

}
