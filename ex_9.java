package ktp_task2;

import java.util.Scanner;

public class ex_9 {
	static boolean isPrefix(String word, String Prefix) {
		if(Prefix.charAt(Prefix.length()-1) == '-') {
			String Prefix2 = Prefix.substring(0,Prefix.length()-1);
			if (word.startsWith(Prefix2)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	static boolean isSuffix(String word,String Suffix) {
		if(Suffix.charAt(0) == '-') {
			String Suffix2 = Suffix.substring(1,Suffix.length());
			if (word.endsWith(Suffix2)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter word and prefix");
		System.out.println(isPrefix(in.next(), in.next()));
		System.out.print("enter word and suffix");
		System.out.println(isSuffix(in.next(), in.next()));
		in.close();
	}

}
