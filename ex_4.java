package ktp_task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex_4 {
//4 - �����, �������, ������� �� ����� ������ ����� �����, ���������� ������, � ������� ������ ����� ����� �������� ������ ���� � ��� ���������� �������� � ������ 
	static void cumulativeSum (List<Integer>  elements) {
		for (int i=1; i<elements.size();i++) {
			int new_el = elements.get(i-1) + elements.get(i); //�������� ���������� ���� � ������� � ���� ��������
			elements.set(i, new_el); //����c����� ���������
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
				//System.out.println(elements);
				cumulativeSum(elements);
				System.out.println("is Avg Prime: " + elements);	
				in.close();
	}

}
