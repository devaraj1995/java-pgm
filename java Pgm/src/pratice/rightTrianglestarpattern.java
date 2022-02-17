package pratice;

import java.util.Scanner;

public class rightTrianglestarpattern {
	public static void main(String[] args) {
		
	//	int i, j,row; 
		int row = 0;
		Scanner scn=new Scanner(System.in);
		scn.nextInt();
		System.out.println("row num");
		
		for (int i= 1; i < row; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println("* ");
				
			}
			
			System.err.println();
		}
	}
}
	      

