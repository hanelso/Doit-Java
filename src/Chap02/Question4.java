package Chap02;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�迭�� ���� ���α׷�!");
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		int[] b = copy(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
			System.out.println("b[" + i + "] : " + b[i]);
		}
		System.out.println("�迭 a�� ���̴� " + a.length);
		System.out.println("�迭 b�� ���̴� " + b.length);

		stdIn.close();
	}

	static int[] copy(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		return b;
	}
}
