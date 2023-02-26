package Exersize2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void bubbleSort(double[] arr) {
		boolean isSorted = false;
		double temp;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int temp, minIndex;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if (i != minIndex) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	public static char[] increaseArr(char[] arr) {
		char[] newArr = new char[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

//	public static void insortinSort(int[] arr) {
//		int temp, j;
//		for (int i = 1; i < arr.length ; i++) {
//			j = i + 1;
//			while (j>0 && arr[j] > arr[j- 1] ) {
//				temp = arr[j];
//				arr[j] = arr[j - 1];
//				arr[j - 1] = temp;
//				j--;
//			}
//		
//		}
//	}



	public static void main(String[] args) {
		double[] arr1 = { 11.12, 212.44, 12.2 };
		int[] arr2 = { 6, 3, 25, 7 };
		bubbleSort(arr1);
		selectionSort(arr2);
		System.out.print(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
//		insortinSort(arr2);
		System.out.print(Arrays.toString(arr2));

		

//		}

	}

}
