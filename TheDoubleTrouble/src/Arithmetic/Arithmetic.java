package Arithmetic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		scan.close();
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}
