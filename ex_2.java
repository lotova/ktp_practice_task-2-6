package ktp_task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex_2 {
	static int differenseMaxMin(List<Integer>  elements) {
		int l = Collections.max(elements)- Collections.min(elements);
		return l;
		}
	
public static void main(String[] args) {
	//заполнение диманического массива в виде списка
	Scanner in = new Scanner(System.in);
	ArrayList <Integer> elements = new ArrayList<Integer>(); //ввод списка	
	System.out.println("enter numbers");
	String str = in.nextLine();
	String[] arr = str.split(" ");
	for(int i =0; i< arr.length;i++) {
		elements.add(Integer.parseInt(arr[i]));
	}
	System.out.println(elements);
	System.out.println("differense MaxMin: "+ differenseMaxMin(elements));	
	in.close();
}

}
