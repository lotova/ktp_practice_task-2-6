package ktp_task2;
import java.util.Scanner;
public class ex_10 {
//�������� �������, ������� ��������� ����� (���) � �������� ��������� �
//���������� ���������� ����� �� ���� ���� ������������������.

	static int countField (int Step) {
		if(Step==0) {
			return 0;
		}
		else {
			if (Step%2 ==0) {
				return Step;
			}
			else {
				return Step+2;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter Step");
		System.out.println("on this step count of fields: "+ countField(in.nextInt()));
		in.close();
	}

}
