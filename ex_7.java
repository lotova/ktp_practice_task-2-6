package ktp_task2;

import java.util.Scanner;


public class ex_7 {
//�������� ������� ������� �� 5 ���������������� ����. �������� ������,
//�������� �������, ����� ����������, �������� �� ���� ��������������
//�������� ��������. �������������� �������� ������ �������� ��������� �������:
//	� ������ ��������� ������ ����� (�� ����������� ������������� ���������� ����).
//	� �� ������ ��������� ������� ��������.
//	� ����� �� ������ ��������� 5 ����. 

static boolean 	isValid (String p_index) {
	if (p_index.length()>5) {
		return false;
	}
	if (p_index.contains(" ")) {
		return false;
	}
	else {
		try {
			int check = Integer.parseInt(p_index);
			return true;
		} catch (Exception e) {
			return false;
		}
			}
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter index");
		System.out.println("Is that index: " + isValid(in.nextLine()));
		in.close();
	}

}
