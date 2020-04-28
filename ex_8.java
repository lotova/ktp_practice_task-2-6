package ktp_task2;

import java.util.Scanner;

public class ex_8 {
//8 функци€, провер€юща€, странные ли строки

	static boolean isStrangePair(String first, String second) {
		if ( (first.charAt(0) == second.charAt(second.length()-1)) && (first.charAt(first.length()-1) == second.charAt(0))) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter two strings");
		String[] arr = in.nextLine().split(" ");
		System.out.println("Is pair of strings strange: "+ isStrangePair(arr[0], arr[1]));
		in.close();
	}

}
