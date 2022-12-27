package prob2;

//사용자 정의 예외 사용하기
public class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackException(String a) {
		super(a);
	}
}
