package Chap01;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구하는 식과 답을 구하는 것입니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i+1;
			if (i + 1 == n)
				System.out.print((i + 1) + " = " + sum);
			else
				System.out.print((i + 1) + " + ");
		}
		
		stdIn.close();
	}
}
