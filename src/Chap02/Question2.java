package Chap02;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
		
		
		stdIn.close();
	}
	
	static void swap(int[] a, int idx1, int idx2)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("a[" + idx1+"]��(��) a["+ idx2+"]�� ��ȯ�մϴ�.");
		int t = a[idx1]; a[idx1]=a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++)
		{
			swap(a, i,(a.length)-1-i);
		}
		
	}
}
