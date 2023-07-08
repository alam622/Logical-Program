package com.general_utility_program;

import java.util.Scanner;

public class _4_Prime_Number_logical_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Prime Numbers are: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= 10; j++) {
				if (i % j == 0 && i != j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
			count = 0;

		}
	}
}
