package coreproject;
import java.util.Scanner;
public class Star {

	

	public static void main(String[] args) {

			 Scanner scr = new Scanner(System.in);

			System.out.print("Enter a number to print star patter: ");
			int size = scr.nextInt();
			System.out.println("\nThe star pattern is... ");
			
			for (int i =1 ; i <= size; i++) { 
				for (int j =1 ; j <= i; j++) {
					


					System.out.print( "*");
			}
				System.out.println();
	}
			for (int i =size ; i >= 1; i--) { 
				for (int j =1 ; j < i; j++) {
					


					System.out.print( "*");
			}
				System.out.println();
	}
			scr.close();
	}
}