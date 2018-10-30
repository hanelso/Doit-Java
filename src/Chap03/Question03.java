package Chap03;

import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수를 입력하세요 : ");
		int num = stdIn.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		int[] idx=new int[num];
		System.out.print("검색할 key값 : ");
		int key = stdIn.nextInt();
		
		int length = searchIdx(arr, num, key, idx);
		
		System.out.println("idx의 내용값은");
		for(int i=0;i<idx.length;i++)
		{
			System.out.println("a[" + i + "] : " + idx[i]);
		}
		System.out.println("idx의 길이는 : " + length);
		
	}

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[j] = i;
				j++;
			}
		}

		return j;
	}
}
