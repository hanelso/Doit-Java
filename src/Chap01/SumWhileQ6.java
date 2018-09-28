package Chap01;

import java.util.Scanner;

public class SumWhileQ6 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지 i가 증가하는 것을 확인합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			System.out.println("i의 값은 "+ i + "입니다.");
			i++;
		}
		
		stdIn.close();
		
	}
}
