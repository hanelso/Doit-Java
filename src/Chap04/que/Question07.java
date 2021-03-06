package Chap04.que;

import Chap04.que.Question05.EmptyIntQueueException;
import Chap04.que.Question05.OverflowIntQueueException;

public class Question07 {
	private int max;
	private int front;
	private int dfront;
	private int rear;
	private int drear;
	private int num;
	private int[] que;
	
	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	// 생.성.자.
	public Question07(int capacity) {
		num = front = rear = dfront = drear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 큐에서 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	// 큐에서 데이터를 d인큐
	public int d_enque(int x) throws OverflowIntQueueException {
		if(num >= max)
			throw new OverflowIntQueueException();
		que[--front] = x;
		num++;
		if(front == 0)
			front = max-1;
		return x;
	}
	
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	// 큐에서 데이터를 d디큐
		public int d_deque() throws EmptyIntQueueException {
			if (num <= 0)
				throw new EmptyIntQueueException();
			int x = que[--rear];
			num--;
			if(rear == 0)
				rear = max-1;
			return x;
		}
	
	// 큐에서 데이터를 피크( 프런트 데이터를 들엳다봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	// 큐에서 데이터를 d피크( 프런트 데이터를 들엳다봄)
		public int d_peek() throws EmptyIntQueueException{
			if(num <= 0)
				throw new EmptyIntQueueException();
			return que[rear-1];
		}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
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
	public int search(int x) {
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
