package Chap01;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���!");
		int val = stdIn.nextInt();
		int i=0;
		do {
			val /=10;
			i++;
		}while(val!=0);
		
		System.out.printf("�� ���� %d�ڸ��Դϴ�.\n",i);
		
		stdIn.close();
	}
}
