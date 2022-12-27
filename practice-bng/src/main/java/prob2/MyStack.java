package prob2;

import java.util.Arrays;

public class MyStack { 
	private String[] buffer;
	static int idx = 0;
	
	public MyStack(int i) { // 생성자
		setBuffer(new String[i]);
	}

	public void push(String string) { // push
		if (idx == buffer.length) { // 다 찼는데 push할 경우 배열 길이 늘림
			buffer = arrLong(buffer, buffer.length);
		}
			
		buffer[idx] = string;
		idx++;
	}

	public String pop() throws MyStackException { // pop
		if (idx == 0) { // 비어있는데 pop할 경우 사용자 정의 예외
			throw new MyStackException("stack is empty");
		}
		
		String resPop = buffer[idx-1];
		buffer[idx-1] = null;
		idx--;
		return resPop;
	}

	public boolean isEmpty() { // isEmpty: 비어있는지 검증
			return idx == 0;
	}

	public String[] getBuffer() {
		return buffer;
	}

	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}
	
	// 배열 크기 늘리는 method
	public String[] arrLong(String[] b, int len) {
		String[] newArr = Arrays.copyOf(b, len+1);
		return newArr;
	}
}