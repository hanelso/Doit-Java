package Chap01;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println(" a ~ b ������ ���� ���Ͻÿ�!");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();

		System.out.println(a + " ~ " + b + " ������ ����! " + sumof(a, b) + "�Դϴ�.");
		
		stdIn.close();
	}

	static int sumof(int a, int b) {
		int sum = 0;
		int min = a > b ? b : a;
		int max = a > b ? a : b;

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
}
