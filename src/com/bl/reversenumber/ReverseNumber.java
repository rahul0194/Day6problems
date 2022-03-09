package com.bl.reversenumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		System.out.print("Enter the number that you want to reverse: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse_number = 0;

		for (; num != 0; num = num / 10) {
			int remainder = num % 10;
			reverse_number = reverse_number * 10 + remainder;
		}
		System.out.println("The reverse of the given number is:" + reverse_number);
		sc.close();
	}
}
