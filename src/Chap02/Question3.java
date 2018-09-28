package Chap02;

import java.util.Scanner;

public class Question3{
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
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0;i<num;i++)
		{
			System.out.println("x[" + i + "] = " + x[i]);
		}
		System.out.println("��� ����� ���� " +sumOf(x)+"�Դϴ�.");
		
		stdIn.close();
	}
	
	static void swap(int[] a, int idx1, int idx2)
	{
		int t = a[idx1]; a[idx1]=a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++)
		{
			swap(a, i,(a.length)-1-i);
		}
	}
	
	static int sumOf(int[] a)
	{
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
}
