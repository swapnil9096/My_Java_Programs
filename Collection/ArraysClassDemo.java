package Collection;

import java.util.Arrays;

/*
 * The Arrays class belongs to java.util package. 
 * This class is from Collection Framework. 
 * This class provides static methods dynamically create and access java arrays. 
 * It consists of only static methods . 
 * Arrays usage:
 * Search in an Arrays.
 * Sort an Arrays
 * Fill an array with a particular value.
 */
public class ArraysClassDemo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int res = Arrays.binarySearch(arr, 2);// index of searched index
		System.out.println("Binary Searched index res: " + res);// 1
		res = Arrays.binarySearch(arr, 98);
		System.out.println("Binary Searched index res: " + res); // -11
		System.out.println("Arrays.toString(arr): " + Arrays.toString(arr));

		res = Arrays.binarySearch(arr, 0, 9, 6);
		// returns index , exlcuding last index in the range
		System.out.println("Binary Searched index res: " + res);

		res = Arrays.binarySearch(arr, 0, 2, 13); // returns index
		System.out.println("Binary Searched index res: " + res); // -3

		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 10, 20, 30 };
		int arr3[] = { 10, 20 };
		int arr4[] = { 10, 20, 30, 40 };
		int arr5[] = { 40, 30, 20, 10, 50 };
		int arr5_1[] = { 40, 30, 20, 10, 50 };
//Returns value 0 if the first and second array are equal and contain the same elements in the same order;
		System.out.println("comparison(arr1, arr2): " + Arrays.compare(arr1, arr2)); // 2 more element in arr1
		System.out.println("comparison(arr1, arr3): " + Arrays.compare(arr1, arr3)); // 3 more element in arr1
		System.out.println("comparison(arr1, arr4): " + Arrays.compare(arr1, arr4));
		// 1 in arr1
		System.out.println("comparison:(arr1, arr5) " + Arrays.compare(arr1, arr5));

		// -1 element order is not preserved/not found
		System.out.println("comparison:(arr5, arr1) " + Arrays.compare(arr5, arr1)); // 1

		// 1
		System.out.println("comparison:(arr5_1, arr1) " + Arrays.compare(arr5, arr5_1)); // 0

		// copy arr to other array using copyOf method
		int arr11[] = { 10, 20, 30, 40, 50 };
		System.out.println("Arrays.copyOf(arr11, 10: " + Arrays.toString(Arrays.copyOf(arr11, 10)));

		int[] brr = Arrays.copyOf(arr11, 10);
		// 10 20 30 40 50 0 0 0 0 0
		System.out.println("Arrays.copyOf(arr11, 10): " + Arrays.toString(brr)); // 10 20 30 40 50 0 0 0 0 0

		System.out.println(Arrays.toString(Arrays.copyOf(arr11, 4))); // 10 20 30 40
		

		// 1,3 3 excluded
		System.out.println("CopyOf with range1,3: " + Arrays.toString(Arrays.copyOfRange(arr11, 1, 3))); // 20 30

		// deeplyEqual: all elements at all indexes should be same- true else false
		int a1[][] = { { 10, 20, 30 } };
		int a2[][] = { { 10, 20, 30 } };
		int a3[][] = { { 10, 20, 30, 40 } }; // To compare both arrays
		System.out.println("DeepEqual comparision Arrays.deepEquals(a1, a2): " + Arrays.deepEquals(a1, a2));
		System.out.println("DeepEqual comparision Arrays.deepEquals(a1, a3): " + Arrays.deepEquals(a1, a3));

		// equals
		int a31[] = { 10, 20, 30 };
		int a41[] = { 10, 20, 30 };
		System.out.println("a31 equals a41: " + Arrays.equals(a31, a41));

		// fill method
		int a5[] = { 10, 20, 30, 40, 50 };
		Arrays.fill(a5, 100);
		System.out.println("Array fill a5: " + Arrays.toString(a5)); // 100 100 100 100 100

		// hashcode
		System.out.println("hashcode: " + Arrays.hashCode(a5));

		// mismatch: finds index where mismatch happens
		int a6[] = { 10, 2000, 30, 40, 50 };
		int a7[] = { 10, 200, 30 };
		System.out.println("The element mismatched at index: " + Arrays.mismatch(a6, a7)); // 1

		// sort
		int c1[] = { 210, 12, 15, 11, 8 };
		Arrays.sort(c1);// quicksort
		System.out.println("Sorted Array: " + Arrays.toString(c1));

		// Parallel Sort
		int b1[] = { 210, 12, 15, 11, 8 };
		Arrays.parallelSort(b1);//It Efficient than quicksort 
		System.out.println("Parallel Sorted Array: " + Arrays.toString(b1));

		// range sort
		int d1[] = { 10, 20, 34, 11, 5 };
		Arrays.sort(d1, 2, 5);
		System.out.println("Range sort Array: " + Arrays.toString(d1)); // 10 20 5 11 34
	}

}
