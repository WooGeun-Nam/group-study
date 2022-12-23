package prob2; // 배열 늘리는 메소드

public class MyStack {
	private String[] buffer;
	private static int index;

	public MyStack(int i) {
		buffer = new String[i];
		index = 0;
	}

	public boolean isEmpty() {
		if (index <= 0) return true;
		return false;
	}

	public void push(String string) {
		reSizing();
		buffer[index] = string;
		index++;
	}
	
	public void reSizing() {
		if(buffer.length<=index) {
			String[] save = new String[index];
			save = buffer;
			buffer = new String[index*2];
			for(int i=0; i<save.length; i++) {
				buffer[i] = save[i];
			}
		}
	}

	public String pop() {
		if (index<1) throw new MyStackException("stack is empty");
		return buffer[--index];
	}
	
}