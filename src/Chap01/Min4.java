package Chap01;

import java.util.Scanner;

public class Min4 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		System.out.println("최소값은 " + min4(a,b,c,d)+ "입니다.");
		
		stdIn.close();
	}
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		
		return min;
	}
}
