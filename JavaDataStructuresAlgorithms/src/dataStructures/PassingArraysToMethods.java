package dataStructures;

import java.lang.reflect.Array;

public class PassingArraysToMethods {

	public static void main(String args[]) {
		printArray();
	}
	
	public static void printArray() {

		int array[] = { 3, 1, 2, 6, 4, 2 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}
}
