package test3;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]) {
		int a[] = { 10, 20, 19, 30, 40, 50, 60, 90, 70, 85, 100 };
		Arrays.sort(a);

		int key = 85;
		int first = 0;
		int last = a.length - 1;
		String s = "";
		while (first <= last) {
			int mid = (first + last) / 2;
			if (key > a[mid]) {
				first = mid + 1;
			}

			else if (key < a[mid]) {
				last = mid - 1;
			} else {
				s += "key " + key + " is found at index:" + mid;
				break;
			}

		}
		if (s == "")
			System.out.println("element not present");
		else
			System.out.println(s);

	}
}
