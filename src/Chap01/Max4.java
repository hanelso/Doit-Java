package Chap01;

import java.util.Scanner;

public class Max4 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		System.out.println("�ִ밪�� "+max4(a,b,c,d)+"�Դϴ�.");
		
		stdIn.close();
	}
	
	static int max4(int a, int b, int c, int d)
	{
		int max = a;
		if( b > max)
			max = b;
		if( c > max)
			max = c;
		if( d > max)
			max = d;
		
		return max;
	}
}
