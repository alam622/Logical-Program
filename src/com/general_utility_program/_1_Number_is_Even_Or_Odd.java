package com.general_utility_program;

import java.util.Scanner;

public class _1_Number_is_Even_Or_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int x=sc.nextInt();
		if (x%2==0) {
			System.out.println("Even Number is "+x);
		}else {
			System.out.println("Odd Number is "+x);
		}
	}
}
