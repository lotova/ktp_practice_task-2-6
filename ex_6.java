package ktp_task2;

import java.util.Scanner;

public class ex_6 {
//Создайте функцию, которая при заданном числе возвращает соответствующее число Фибоначчи. 
static long  Fibonacci(int number) {
	if (number == 0) {
		return 0;
	}
	if (number == 1) {
		return 1;
	}
	else {
		return Fibonacci(number-1) + Fibonacci(number-2);
	}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number for Fibonacci");
		System.out.println("number Fibonacci:" + Fibonacci(in.nextInt()));
		in.close();
	}

}
