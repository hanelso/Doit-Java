package Chap01;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요!");
		int val = stdIn.nextInt();
		int i=0;
		do {
			val /=10;
			i++;
		}while(val!=0);
		
		System.out.printf("그 수는 %d자리입니다.\n",i);
		
		stdIn.close();
	}
}
