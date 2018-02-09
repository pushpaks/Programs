package prac.arrays;

public class FindEleInRotArr {

	public static void main(String[] args) {
	//	int a[] = { 3, 4, 5, 6, 7, 1, 2 };
		int a[] = { 3, 4, 5, 6, 7};
		int start = 0;
		int end = a.length - 1;
		int pivot = findPivot(a);
		int key = 10;
		if (pivot > 0 && key >= a[start] && key <= a[pivot - 1]) {
			System.out.println(binarySearch(a, start, pivot, key));
		} else {
			System.out.println(binarySearch(a, pivot + 1, end, key));
		}
	}

	private static int findPivot(int[] a) {

		if (a == null || a.length == 0) {
			return -1;
		}
		if (a.length == 1 || a[0] < a[a.length - 1]) {
			return -1;
		}

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] > a[mid + 1]) {
				return mid + 1;
			} else if (a[start] <= a[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;

			}

		}
		return -1;
	}

	private static int binarySearch(int a[], int start, int end, int key) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (key < a[mid]) {
				end = mid - 1;
			} else {

				start = mid + 1;
			}

		}
		return -1;
	}
}
