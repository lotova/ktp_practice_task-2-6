package ktp_task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_3 {
//3 - �������� ������� �� ��, �������� �� ������� ��������� ���� ��������� ����� ���� ��� ���
static boolean isAvgWhole (List<Integer>  elements) {
	double Avg = 0;
	for (int x: elements) {
        Avg += x;
        }
	Avg=Avg/elements.size();
	if (Avg == (int)Avg) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		//���������� ������������� ������� � ���� ������
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> elements = new ArrayList<Integer>(); //���� ������	
		System.out.println("enter numbers");
		String str = in.nextLine();
		String[] arr = str.split(" ");
		for(int i =0; i< arr.length;i++) {
			elements.add(Integer.parseInt(arr[i]));
		}
		System.out.println(elements);
		System.out.println("is Avg Prime: " + isAvgWhole(elements));	
		in.close();

	}

}
