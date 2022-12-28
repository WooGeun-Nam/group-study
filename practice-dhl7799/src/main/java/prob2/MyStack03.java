package prob2;

public class MyStack03<T> {
	private int size;
	private int top;
	private T[] sstack;
	
	@SuppressWarnings("unchecked")
	public MyStack03(int n) {
		this.size = n*n;
		this.top = -1;
		sstack = (T[])new Object[size];
		
	}
	
	public void push(T s) {
		this.top += 1;
		this.sstack[top] = s;
		
	}
	
	//resize() 구현은 임시로 new temp 해서 배열만들고 거기 기존배열 옮긴 뒤 
	//sstack에 덮어씌우기
	
	public T pop() throws MyStackException{
		if(top == -1)
			throw new MyStackException("\"Prob5.MyStackException: stack is empty\"");
		T s = sstack[top];
		top--;
		return s;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
}
