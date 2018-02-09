package prac.arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 7, 8, 5, 6, 4, 3 };
		Arrays.sort(a);
		int n = 2;
		rotateArray(a, n);
		printArrays(a);
	}

	private static void rotateArray(int[] a, int n) {

		reverse(a, 0, n - 1);
		reverse(a, n, a.length - 1);
		reverse(a, 0, a.length - 1);

	}

	private static void reverse(int a[], int start, int end) {

		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;

		}
	}

	private static void printArrays(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
