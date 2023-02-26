import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	public static boolean rec(char[] str1, char[] str2, int size1, int size2){
//		if(size1 == 1){
//		 if (str1[size1-1] == str2[size1-1]){
//		return true;
//		}else{
//		return false;
//		}
//		 }else{
//		if (size1 == size2 && str1[size1-1] == str2[size1-1]){
//		return rec(str1, str2, size1-1, size2-1);
//		}else{
//		return false;
//		}
//		}
//
//		}
	
//	public static String[] incremntArr(String[] strArr){
//		String[] newStrArr = new String[strArr.length+1];
//		for (int i=0;i< strArr.length; i++){
//		newStrArr[i]  = strArr[i];
//		}
//		return newStrArr ;
//		}
//
//		public static String[] getData(String[] strArr){
//		Scanner in = new Scanner(System.in);	
//		String input = in.nextLine();
//		String word;
//		while(input != null){
//			if(input.indexOf(' ') != -1) {
//					word = input.substring(0, input.indexOf(' '));
//		
//			}else {
//				word = input;
//			}
//		input = input.substring( input.indexOf(' ')+1);
//		strArr =incremntArr(strArr);
//		strArr[strArr.length-1]= word;
//		
//		}
//		return strArr;
//		}
//
		public static void sort(String[] strArr){
		for (int i=0; i<strArr.length-i-1;i++){
		int j=i;
		while( j!= strArr.length-1 ){
		if(strArr[j].compareTo(strArr[j+1])> 0){
		String temp = strArr[j];
		strArr[j] = strArr[j+1];
		strArr[j+1] = temp;
		}

		j++;
		}
		}
		}
//
//
//		public static void sort2(String[] strArr){
//		for (int i=0; i<strArr.length-i-1;i++){
//		int j=i;
//		while( j!= strArr.length-1 ){
//		if(strArr[j].compareTo(strArr[j+1])< 0){
//		String temp = strArr[j];
//		strArr[j] = strArr[j+1];
//		strArr[j+1] = temp;
//		}
//
//		j++;
//		}
//		}
//		}
//
//		public static void ChackOddChar(String[] strArr){
//		if (strArr[0].charAt(0) > strArr[1].charAt(1) ){
//		sort(strArr);
//		}else{
//		sort2(strArr);
//		}
//		}
//
//		public static String[] som(){
//		String[] strArr = new String[0];
//System.out.println("plaese enter some valus");
//		strArr = getData(strArr);
//		ChackOddChar(strArr);
//		return strArr;
//		}
		
	public static double beforePoint(String str){
		double num=0;
		char ch;
		int i=0;
		if (str.charAt(0) == '-'){
		i++;
		}
		ch = str.charAt(i);
		while(ch != '.'){
		num += ch-'0';
		num*=10;
		i++;
		ch = str.charAt(i);
		}
		return num;
		}

		public static double afterPoint(String str){
		double num=0;
		char ch;
		int i=0;

		ch = str.charAt(i);
		while(ch != '.'){
		i++;
		ch = str.charAt(i);
		}
		while(ch>= '0' || ch<='9'){
		num += ch-'0';
		num*=10;
		i++;
		ch = str.charAt(i);
		}

		return num/100;
		}

		public static double strToDouble(String str){
		int minus=1;
		if (str.charAt(0) == '-'){
		minus= -1;
		}
		return (beforePoint(str) + afterPoint(str)) *minus;
		}
		public static void changeStrToDouble(String[] realStr, double[] doubles){

		for(int i=0;i<realStr.length;i++){
		doubles[i] = strToDouble(realStr[i]);
		}
		sort(realStr);
		}
	
	public static void main(String[] args) {
		String[] str1 = {"11.22","22.55","-32.87"};
		double[] doubles = new double[3];
//	char[] str1 = new char[5];
//		char[] str2 = {'a','b',};
//System.out.print( rec(str1, str2, 3, 2));

//System.out.println(som());
		
	changeStrToDouble(str1, doubles);
	}
}
