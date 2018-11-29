package Chap04.que;

public class Question04 {
	private int max;
	private int num;
	private int[] que;

	public Question04(int capacity) {
		max = capacity;
		num = 0;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();
		return que[num++] = x;
	}

	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int value = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;
		return value;
	}

	public int peek() throws EmptyIntQueueException {
		return que[0];
	}

	public int indexOf(int x) {

		for (int i = 0; i < num; i++) {
			if (que[i] == x)
				return i;
		}
		return -1;
	}
	
	public void clear() {
		num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		for(int i=0;i<num;i++)
		{
			System.out.print(que[i] + " ");
		}
		System.out.println();
	}

}
