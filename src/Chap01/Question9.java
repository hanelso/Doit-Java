package Chap01;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println(" a ~ b 까지의 합을 구하시오!");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();

		System.out.println(a + " ~ " + b + " 까지의 합은! " + sumof(a, b) + "입니다.");
		
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
