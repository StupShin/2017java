import java.util.Scanner;

public class Exercise1 {
	public static void sum(int a, int b){
		int sum = 0;							
		for(int i = a; i <=b; i++){				
			sum = sum + i;						
			System.out.print(i);				
			if(i== b){							
				System.out.print("=");			
				System.out.println(sum);		
			}						
			else
				System.out.print("+");			
		}
	}
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int str = a.nextInt();
		int end = a.nextInt();
		sum(str, end);	//4번 줄의 sum을 호출하는 것.
	}
}
