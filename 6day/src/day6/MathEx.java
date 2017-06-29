package day6;

public class MathEx {
	public static void main(String[] args){
		double a = 2.78987434;
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.exp(1.5));
		System.out.println(Math.rint(3.141592));
		System.out.println("이번 주 행운의 번호는 ");
		
		for(int i=0; i<6 ; i++)
			System.out.println(Math.round(1+Math.random()*44) + " ");
		System.out.println("입니다.");
	}
}
