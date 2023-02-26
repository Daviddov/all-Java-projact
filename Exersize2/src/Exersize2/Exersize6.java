package Exersize2;

import java.util.Arrays;



public class Exersize6 {

	public static int bigThanZero(double[] numArr) {
		int count = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int copyodd(int[] A, int[] B, int from) {
		int countEven = 0;
		for (int i = 0; i < B.length; i++) {

			for (int j = from; j < A.length; j++) {
				if (A[j] % 2 == 1) {
					B[i] = A[j];
					countEven++;
				}
			}
		}
		return countEven;
	}

	public static int removeOdd(int[] A) {
		int count = 0, temp;
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[j] % 2 == 0) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					count++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(A));
		return count;
	}

	public static void splitParity(int[] A) {
		int temp;
		for (int i = 0; i < A.length; i++) {
			while(i+1%2 ==0 && i%2==1) {
				temp = A[i];
				A[i] = A[i+1];
				A[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(A));
	}
	

	public static void printTriangle(int n) {
		if(n==1) {
			System.out.println("* ");
		}else {
			
			printTriangle(n-1);
			for (int i= 0; i<n; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void printTriangleUp(int n) {
		if(n==1) {
			System.out.println("* ");
		}else {
			for (int i= 0; i<n; i++) {
				System.out.print('*');
			}
			System.out.println();
			printTriangleUp(n-1);
		}
	}
	
	public static void printTriangles(int n) {
		printTriangleUp(n);
		printTriangle(n);
	}
	
	public static boolean isSortDown(int num) {
		int digLast, digBefore;
		boolean res= false;
		if (num <100){
			digLast = num%10;
			digBefore = num%100 / 10;
			return digLast < digBefore;
		}else {
			digLast = num%10;
			digBefore = num%100 /10;
			if( digLast < digBefore) {
			res =isSortDown(num/10);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
//		int[] arr= {4,7,6,7,7,2};
//	System.out.println(removeOdd(arr)); 
//	splitParity(arr); 
//		printTriangles(5);
		System.out.print(isSortDown(12345)); 
}

}
