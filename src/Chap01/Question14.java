package Chap01;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int n = stdIn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
		
		stdIn.close();
	}
}
