package com.gmail.jenya.isa;

import java.util.Arrays;
import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Input array size:");
		n = sc.nextInt();
		int[][] array = new int[n][n];
		int Sum=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = j + 1;
				if (i == j) {
					Sum = Sum + array[i][j];
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Sum);
	}

}
