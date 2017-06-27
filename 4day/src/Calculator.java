import java.util.Scanner;

class Add {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a; //this를 안 쓰면 바로 윗 줄의 a를 지칭
		this.b = b;
	}
	public int calculate(){
		return a+b;
	}
}

class Sub {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a-b;
	}
}

class Mul {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a*b;
	}
}

class Div {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public double calculate(){
		return a/b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요>>");
		
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().charAt(0);
		
		switch(c){
			case'+' :
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
			case'-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
			case'*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
			case'/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
				default:
				break;
		}
	}
}
