package Chap01;

import java.util.Scanner;

public class SumWhileQ6 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n���� i�� �����ϴ� ���� Ȯ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			System.out.println("i�� ���� "+ i + "�Դϴ�.");
			i++;
		}
		
		stdIn.close();
		
	}
}
