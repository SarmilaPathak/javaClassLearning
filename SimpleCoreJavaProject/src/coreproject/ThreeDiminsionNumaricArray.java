package coreproject;

import java.util.Scanner;

public class ThreeDiminsionNumaricArray {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
System.out.println("Enter the size of array:");
int size = scr.nextInt();
int x[]= new int[size];
int y[]= new int[size];
int z[]= new int[size];
for(int i=0; i<size;i++) {
	System.out.println("Enter numbers for 1st Array:");
	x[i] = scr.nextInt();
}
for(int i=0; i<size;i++) {
	System.out.println("Enter numbers for 2nd Array:");
	y[i] = scr.nextInt();
}
for(int i=0; i<size;i++) {
	System.out.println("Enter numbers for 3rd array:");
	z[i] = scr.nextInt();
}scr.close();
	System.out.println("=======> Total sum of arrays <=======");
	for(int i=0; i<size;i++) {
	System.out.print( x[i]+  y[i] + z[i] + "\t");
	}

}
}