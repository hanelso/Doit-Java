package Chap03;

import java.util.Scanner;

public class Question02 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i< num; i++)
		{
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen2(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
	
//	static int seqSearchSen(int[] a, int n, int key)
//	{
//		int i=0;
//		
//		a[n] = key;
//		
//		while(true) {
//			if(a[i] == key)
//				break;
//			i++;
//		}
//		return i == n ? -1 : i;
//	}
	
	static int seqSearchSen2(int[] a, int n, int key)
	{
		a[n] = key;
		
		System.out.print("  |");
		for(int i=0;i<n;i++)
			System.out.printf("%2d", i);
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		for(int i=0;i<n;i++)
		{
			//1번째 줄 decoration
			System.out.print("  |");
			for(int j=0;j<i;j++)
				System.out.print("  ");
			System.out.println(" *");
			
			// 2번째 줄 decoration
			System.out.printf("%2d", i);
			System.out.print("|");
			for(int j=0;j<n;j++)
			{
				System.out.printf("%2d", a[j]);
			}
			System.out.println();
			
			if(a[i] == key)
				return i;
			else
				System.out.println("  |");
				// 3번째 줄!
			
		}
		return -1;
	}
}
