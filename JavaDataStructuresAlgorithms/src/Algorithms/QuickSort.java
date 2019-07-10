package algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	
	public void quickSort(int[] A) {
		quickSort(A, 0, A.length - 1);
	}

	
	private void quickSort(int[] A, int low, int high) {
		if (low < high) {
			int p = partition(A, low, high);
			quickSort(A, low, p - 1);
			quickSort(A, p + 1, high);
		}
	}

	private void swap(int[] A, int index1, int index2) {
		
	}

	public static void main(String[] args) {

	}

}
