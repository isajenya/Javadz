package com.gmail.jenya.isa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] payArray = new int[12];
		for (int i = 0; i < payArray.length; i++) {
			payArray[i] = 5000 + (int) (Math.random() * 5000);
		}
		System.out.println(Arrays.toString(payArray));
		int totalSum = 0;
		for (int i = 0; i < payArray.length; i++) {
			totalSum += payArray[i];

		}
		System.out.println(totalSum);
		System.out.println("Avarenge is " + (totalSum / payArray.length));
		int [] [] arrayOne = new int [4][5];	
	}

}
