package pratice;

import java.util.Scanner;

public class Ladderpgm {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
//int n=15;
	int n =scn.nextInt();
	if(n%5==0 && n%3==0){
		System.out.println("hai bye");
	} 
		else if(n%5==0) {
			System.out.println("hai");
		}
		else if(n%3==0)	{
			System.out.println("bye");
		}
		else {
			System.out.println();
		}
	}

	}


