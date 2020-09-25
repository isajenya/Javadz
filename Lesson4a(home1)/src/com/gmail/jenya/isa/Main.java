package com.gmail.jenya.isa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Input a");
		a = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < a; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println("");
		}
	}

}
