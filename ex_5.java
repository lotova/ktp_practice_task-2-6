package ktp_task2;

import java.util.Scanner;

public class ex_5 {
//функция, которая возвращает число десятичных знаков, которое имеет число,
	//заданное в виде строки. Любые нули после десятичной точки отсчитываются в сторону
	//количества дес.знаком
	static int getDecimalPlaces (String number) {
		if (number.contains(".")) {
		String [] splitter = String.valueOf(number).split("\\.");
		//String [] splitter = String.valueOf(x).split("\\.");
		int i = splitter[1].length();
		return  i;
		}
		else 
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		//вывод результата и прием вводного числа
		Scanner in = new Scanner(System.in);
		System.out.println("enter double number");
		System.out.println("count of Decimal Places: "+ getDecimalPlaces(in.next()));
		in.close();
	}

}
