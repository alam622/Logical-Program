package com.general_utility_program;

import java.util.Scanner;

public class _5_Prime_Number_logical_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int i = sc.nextInt();
			int ch = 0;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					ch++;
					break;
				} else {
					j++;
				}
			}
			if (ch == 0) {
				System.out.println("Prime Number: " + i);
			} else {
				System.out.println("Not Prime Number: " + i);
			}
		}
	}
}
