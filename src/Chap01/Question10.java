package Chap01;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		int b = 100;
		do {
			if(b !=100 && b<=a)
				System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
		} while (b <= a);
		
		System.out.println("b-a�� " + (b-a) + "�Դϴ�.");

		stdIn.close();
		
	}
}
