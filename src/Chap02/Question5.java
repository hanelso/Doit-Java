package Chap02;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("배열을 역순으로 복사하는 프로그램!");
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		int[] b = rcopy(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
			System.out.println("b[" + i + "] : " + b[i]);
		}
		System.out.println("배열 a의 길이는 " + a.length);
		System.out.println("배열 b의 길이는 " + b.length);

		stdIn.close();

	}

	static int[] rcopy(int[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - 1 - i];
		}

		return b;
	}
}
