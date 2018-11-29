package Chap04.stack;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)데어터 찾기  (6)스택 상태 확인  (7)청소   (0)종료 : ");
			
			int menu = stdIn.nextInt();
			if (menu == 0) 
				break;
			
			int x;
			switch(menu) {
			case 1:			// 푸시
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:			// 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 3:			// 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4:			// 덤프
				s.dump();
				break;
				
			case 5:
				int index;
				x = stdIn.nextInt();
				index = s.indexOf(x);
				if(index == -1)
					System.out.println("찾으시는 값이 스택에 없습니다.");
				else
					System.out.println("찾으시는 값은 " + index + " 에 위치하고 있습니다.");
				break;
				
			case 6:
				if(s.isEmpty() == true)
					System.out.println("스택이 비어있습니다.");
				else if(s.isFull() == true)
					System.out.println("스택이 꽉 차있습니다.");
				else
					System.out.println("스택의 " + s.capacity() + " 중 " + s.size() + "를 이용중입니다.");
				break;
				
			case 7:
				System.out.println("스택을 전부 청소합니다.");
				s.clear();
				break;

			}
		}
		
		stdIn.close();
	}}
