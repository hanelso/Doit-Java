package Chap01;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형의 종류와 층수를 정하고 만드는 프로그램입니다.");
		System.out.print("몇단의 삼각형을 원하십니까? : ");
		int n = stdIn.nextInt();
		System.out.println("어떤 삼각형의 종류를 원하십니까?");
		System.out.println("직각의 위치 -> 1.왼아래 2.왼위 3.오른위 4.오른아래");
		System.out.print("선택해주세요!! : ");
		int select = stdIn.nextInt();
		
		switch(select) {
		case 1:
			triangleLB(n);
			break;
		case 2:
			triangleLU(n);
			break;
		case 3:
			triangleRU(n);
			break;
		case 4:
			triangleRB(n);
			break;
		default:
			System.out.println("눈없냐");
			break;
		}
		
		stdIn.close();
	}
	
	static void triangleLB(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
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
