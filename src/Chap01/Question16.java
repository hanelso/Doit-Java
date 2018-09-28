package Chap01;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정삼각형을 출력하는 프로그램입니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		spira(n);
		
		stdIn.close();
	}
	
	static void spira(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+i;j++)
			{
				if(n-1-i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
