package prac.arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int a1[] = { 1, 3, 5, 7 };
		int a2[] = { 2, 4, 6, 8 };
		int a3[] = new int[a1.length + a2.length];
		mergeArrays(a1, a2, a3);
	}

	@SuppressWarnings("unused")
	private static void mergeArrays(int[] a1, int[] a2, int[] a3) {
		int i = 0, j = 0, n1 = a1.length, n2 = a2.length, k = 0;

		if (a1 == null && a2 == null) {
			return;
		}
		if (a1 == null || n1 == 0) {
			printArray(a2);
			return;
		}
		if (a2 == null || n2 == 0) {
			printArray(a1);
			return;
		}

		while (i < n1 && j < n2) {
			if (a1[i] < a2[j]) {
				a3[k++] = a1[i++];
			} else {
				a3[k++] = a2[j++];
			}
		}
		while (i < n1) {
			a3[k++] = a1[i++];

		}
		while (j < n2) {
			a3[k++] = a2[j++];

		}
		printArray(a3);
	}

	private static void printArray(int[] a3) {
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i]);
		}
	}

}
