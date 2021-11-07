package com.coreprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter number2 : ");
		int num2 = scan.nextInt();
		System.out.print("Enter number3 : ");
		int num3 = scan.nextInt();
		
		int largest=0;
		if (num1>num2) {
			largest=num1;
		}
		else {
			largest=num2;
		}
		if(largest>num3) {
			System.out.println("The largest among three numbers is : "+largest);
		}
		else {
			System.out.println("The largest among three numbers is : "+num3);
			
		}
		
	}

}
