package ktp_task2;

import java.util.Scanner;

public class ex_5 {
//�������, ������� ���������� ����� ���������� ������, ������� ����� �����,
	//�������� � ���� ������. ����� ���� ����� ���������� ����� ������������� � �������
	//���������� ���.������
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
		//����� ���������� � ����� �������� �����
		Scanner in = new Scanner(System.in);
		System.out.println("enter double number");
		System.out.println("count of Decimal Places: "+ getDecimalPlaces(in.next()));
		in.close();
	}

}
