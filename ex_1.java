package ktp_task2;

import java.util.Scanner;

public class ex_1 {
	//1- повторить каждый символ  в строке n раз
	static String repeat (String str, int n) {
		String newstr = "";
		for (int i = 0; i< str.length();i++) {
			for (int j = 0; j<n; j++) {
				newstr += str.charAt(i);
			}
		}
			
		return newstr;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("#1 - enter line and  count");
		System.out.println(repeat(in.nextLine(), in.nextInt()));
		in.close();
	}
	}


