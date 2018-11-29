package Chap04.stack;

public class IntStack {
	
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 스택의 TOP에 데이터를 넣는 메소드
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	// 스택의 TOP에 있는 데이터를 빼는 메소드
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//스택의 TOP에 있는 데이터를 엿보는 메소드
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//스택에서 x를 찾아 인데스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i] == x)
				return i;
		return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr =0;
		// ptr이 0이 되면 pop을 할때 -1이 되므로 에러를 나타내고 push를 하면 0에 값이있어도 덮어쓰기 때문에 실제 메모리에 데이터가 들어가 있더라도 개념적으로 새로운 스택배열이된다.
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
		// 인덱스가 0부터 시작하므로 현재 top보다 1이 큰 ptr이 용량과 같다.
	}
	
	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가즉 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택 안의 모든 데이터를 bottom -> Top 순으로 출력
	public void dump() {
		if(ptr<=0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i=0; i< ptr;i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
