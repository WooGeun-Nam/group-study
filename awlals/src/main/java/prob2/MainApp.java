package prob2;
//stack 만드는 문제
//배열 사이즈 2배 정도 늘리기(새배열 만들고 늘린담에 버퍼 이용해 복사, 연결시키기)
//pop, 
public class MainApp {

	public static void main(String[] args) throws MyStackException {
		MyStack stack = new MyStack(3);
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");

		while (stack.isEmpty() == false) {
			String s = stack.pop();
			System.out.println( s );
		}

		System.out.println("======================================");

		stack = new MyStack(3);
		stack.push("Hello");

		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
