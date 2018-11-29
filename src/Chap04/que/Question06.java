package Chap04.que;

import Chap04.que.Question05.EmptyIntQueueException;
import Chap04.que.Question05.OverflowIntQueueException;

public class Question06<E> {
	private int max;
	private int front;
	private int rear;
	private int num;
	private E [] que;
	
	// 실행 시 예외 : 큐가 비어 있음
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {}
	}
	
	// 생.성.자.
	public Question06(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 큐에서 데이터를 인큐
	public E enque(E x) throws OverflowGqueueException {
		if(num >= max)
			throw new OverflowGqueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	// 큐에서 데이터를 디큐
	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();
		E x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	// 큐에서 데이터를 피크( 프런트 데이터를 들엳다봄)
	public E peek() throws EmptyGqueueException{
		if(num <= 0)
			throw new EmptyGqueueException();
		return que[front];
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(E x) {
		for(int i=0;i<num;i++)
		{
			int idx = (i + front) % max;
			// front가 어디에 있던 몇번째 인덱스인지가 중요하기 때문에  max로 나눈 나머지값으로 인덱싱을 한다.
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}
	
	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i=0;i<num;i++)
			{
				System.out.print(que[(i+front) % max] + " ");
			}
			System.out.println();
		}
	}
	
	//서치 메소드 추가!!!!!!!
	public int search(E x) {
		for(int i=0;i<num;i++)
		{
			int idx = (i + front) % max;
			// front가 어디에 있던 몇번째 인덱스인지가 중요하기 때문에  max로 나눈 나머지값으로 인덱싱을 한다.
			if(que[idx] == x)
				return i+1;
		}
		return 0;
	}
}
