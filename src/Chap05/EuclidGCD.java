package Chap05;

import java.util.Scanner;

// 유클리드 호재법
// 유클리드 호재법이란 직사각형으로 생각해서 정사각형으로 나뉠때까지 계속해서 자르다보면 마지막에 만들어지는 정사각형의 한변의 길이가 두 수의 최대공약수라는 이론이다.

public class EuclidGCD {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요. : ");
		int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x%y);
	}
}
