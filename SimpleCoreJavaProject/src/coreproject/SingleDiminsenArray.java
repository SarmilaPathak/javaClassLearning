package coreproject;
import java.util.Scanner;
public class SingleDiminsenArray {

	

	

	public static void main(String[] args) {
		 Scanner scr = new Scanner(System.in);
		 System.out.println("Enter the number of colors: ");
			int number = scr.nextInt();
			
			String colors[] =new String[number];
			for (int i =0 ; i < number; i++) 
			{
				System.out.println( "Enter colors name:");
		           colors[i] = scr.next();
		        }  
			scr.close();
		        System.out.println("=================> Name of colors are <================== ");
		        for(int i=0; i<number; i++)
		        {
		           System.out.print(colors[i] + "\t");
		        }  
	}

}
