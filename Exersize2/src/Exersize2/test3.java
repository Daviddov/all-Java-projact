package Exersize2;

import java.util.Scanner;

public class test3 {


	public static boolean isBalans(int[] arr){
		int countMinus = 0;
		int countPlus = 0;
		for(int i=0; i<arr.length;i++){
	if(arr[i] == 0){
	return false;
	}else if(arr[i]< 0){
	countPlus++;

	}else{countMinus++;
	}
		}
	return countMinus == countPlus;
	}
	
	
	
	public static void main(String[] args) {
		

	Scanner in = new Scanner(System.in);
	int countZ =0;
	String str = in.next();
	while (in.next().charAt(0) != 'A'){

		if (str.charAt(0) == 'Z' || str.charAt(str.length()-1) == 'Z'){
			countZ++;
		}
	}


	}

}
