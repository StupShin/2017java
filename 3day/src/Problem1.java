
public class Problem1 {
	public static void sumPrint(int x) {
//성능향상		System.out.println(x*(x+1)/2);
	}
	public static void main(String[] args) {
		int sum = 0;
		
//성능향상		sumPrint(10);   결과값만 쓸 때.
		
		for(int i = 1; i<=10; i++) {
			sum = sum + i;
			System.out.print(i);;
			if(i==10) {
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.print("+");
		}
	}
}
