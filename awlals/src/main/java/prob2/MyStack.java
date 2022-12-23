package prob2;
//String으로 구현 
public class MyStack {

	private String[] buffer;
	private int arr;
	
	public MyStack(int i) {
		buffer = new String[i * 2];
		arr = -1;
	}

	public void push(String string) {
		arr += 1;
		buffer[arr] = string;
//		System.out.println(buffer[arr]);
		
	}

	public String pop() throws MyStackException {
		if(arr == -1) {
			throw new MyStackException();
		}
		String s = buffer[arr];
		arr -= 1;
		return s;
	}

	public boolean isEmpty() {
		return arr ==-1 ? true : false;
	}
	
}