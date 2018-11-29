package Chap04.stack;

import java.util.Scanner;

public class Question03Tester {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Question03 s = new Question03(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료 : ");
			
			int menu = stdIn.nextInt();
			if (menu == 0) 
				break;
			
			if(selection() == 1 )
				result(s,menu);
			else
				result2(s,menu);
		}
		
		stdIn.close();
	}
	
	public static int selection() {
		
		int x;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("(1)1번 스택  (2)2번 스택 : ");
		x = stdIn.nextInt();		
		
		stdIn.close();
		
		return x;
	}
	
	public static void result(Question03 s, int menu) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		switch(menu) {
		case 1:			// 푸시
			System.out.print("데이터 : ");
			x = stdIn.nextInt();
			try {
				s.push(x);
			}catch(Question03.OverflowIntStackException e) {
				System.out.println("스택이 가득 찼습니다.");
			}
			break;
			
		case 2:			// 팝
			try {
				x = s.pop();
				System.out.println("팝한 데이터는 " + x + "입니다.");
			} catch(Question03.EmptyIntStackException e) {
				System.out.println("스택이 비어 있습니다.");
			}
			break;
			
		case 3:			// 피크
			try {
				x = s.peek();
				System.out.println("피크한 데이터는 " + x + "입니다.");
			}catch(Question03.EmptyIntStackException e) {
				System.out.println("스택이 비어 있습니다.");
			}
			break;
			
		case 4:			// 덤프
			s.dump();
			break;
		}
		
		stdIn.close();
	}
	
	public static void result2(Question03 s, int menu) {
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		switch(menu) {
		case 1:			// 푸시
			System.out.print("데이터 : ");
			x = stdIn.nextInt();
			try {
				s.push2(x);
			}catch(Question03.EmptyIntStackException e) {
				System.out.println("스택이 가득 찼습니다.");
			}
			break;
			
		case 2:			// 팝
			try {
				x = s.pop2();
				System.out.println("팝한 데이터는 " + x + "입니다.");
			} catch(Question03.OverflowIntStackException e) {
				System.out.println("스택이 비어 있습니다.");
			}
			break;
			
		case 3:			// 피크
			try {
				x = s.peek2();
				System.out.println("피크한 데이터는 " + x + "입니다.");
			}catch(Question03.OverflowIntStackException e) {
				System.out.println("스택이 비어 있습니다.");
			}
			break;
			
		case 4:			// 덤프
			s.dump();
			break;
		}
		
		stdIn.close();
	}
}
