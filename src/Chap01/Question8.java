package Chap01;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���콺�� ���ϴ� ���!");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();

		int result = 0;

		if (n % 2 == 0)
			result = (1 + n) * (n / 2);
		else
			result = (1 + n) * (n / 2) + (n / 2 + 1);

		System.out.println("����� " + result + "�Դϴ�.");
		
		stdIn.close();
	}
}
