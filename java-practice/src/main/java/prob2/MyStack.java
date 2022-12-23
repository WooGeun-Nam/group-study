package prob2;

public class MyStack {
	private int index;
	private String[] str;
	
	public MyStack(int num) {
		index = -1;
		str = new String[100];
	}
	
	public void push(String str) {
		index++;
		this.str[index] = str;
	}
	public String pop() throws MyStackException {
		if(index<0) {
			throw new MyStackException("stack is empty\"");
		}
		index--;
		return str[index+1].toString();
	}
	public boolean isEmpty() {
		if(index==-1) return true;
		else return false;
	}
}