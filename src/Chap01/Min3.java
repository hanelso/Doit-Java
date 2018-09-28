package Chap01;

import java.util.Scanner;

public class Min3 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		System.out.println("최소값은 " + min3(a,b,c) + "입니다.");
		
		stdIn.close();
	}
	
	static int min3(int a, int b, int c)
	{
		int min = a;
		
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
	}
}
