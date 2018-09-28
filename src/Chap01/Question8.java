package Chap01;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 가우스로 구하는 방법!");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int result = 0;

		if (n % 2 == 0)
			result = (1 + n) * (n / 2);
		else
			result = (1 + n) * (n / 2) + (n / 2 + 1);

		System.out.println("결과는 " + result + "입니다.");
		
		stdIn.close();
	}
}
