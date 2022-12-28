package prob2;

public class MyStack {
	private int size;
	private int top;
	private String[] sstack;
	public MyStack(int n) {
		this.size = n*n;
		this.top = -1;
		sstack = new String[size];
		
	}
	
	public void push(String s) {
		this.top += 1;
		this.sstack[top] = s;
		
	}
	
	public String pop() throws MyStackException{
		if(top == -1)
			throw new MyStackException("\"Prob5.MyStackException: stack is empty\"");
		String s = sstack[top];
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

//test
