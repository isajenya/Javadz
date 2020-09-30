package com.gmail.jenya.isa;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				sum = sum + 1;
			}
		}
		System.out.println("Sum is " + sum);

	}

}
