package Chap01;

import java.util.Scanner;
// 2�ڸ��� ���(10~ 99)�� �Է��մϴ�.

public class Digits {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do {
			System.out.print("�Է�: ");
			no = stdIn.nextInt();
		} while(no < 10 || no > 99);//while(!(no>=10 && no<=99)); �̰� ��𸣰��� ��Ģ�̶��ϴ�.
		
		System.out.println("���� no�� ���� " + no + "��(��) �Ǿ����ϴ�.");
		
		stdIn.close();
	}
}
