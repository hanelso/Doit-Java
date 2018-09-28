package Chap01;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ������ ������ ���ϰ� ����� ���α׷��Դϴ�.");
		System.out.print("����� �ﰢ���� ���Ͻʴϱ�? : ");
		int n = stdIn.nextInt();
		System.out.println("� �ﰢ���� ������ ���Ͻʴϱ�?");
		System.out.println("������ ��ġ -> 1.�޾Ʒ� 2.���� 3.������ 4.�����Ʒ�");
		System.out.print("�������ּ���!! : ");
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
			System.out.println("������");
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
