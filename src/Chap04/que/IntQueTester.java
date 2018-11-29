package Chap04.que;

import java.util.Scanner;

public class IntQueTester {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		Question05 s = new Question05(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			
			System.out.print("(1)인큐  (2)디큐  (3)피크  (4)덤프  (0)종료 : ");
			
			int menu = stdIn.nextInt();
			if (menu == 0) 
				break;
			
			int x;
			switch(menu) {
			case 1:			// 인큐
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				}catch(Question05.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2:			// 디큐
				try {
					x = s.deque();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(Question05.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 3:			// 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(Question05.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 4:			// 덤프
				s.dump();
				break;
				
			case 9:
				x = s.search(3);
				System.out.println("찾은 데이터는 " + x + "번째 데이터 입니다.");
				break;
			}
		}
	}
}
