import java.util.Scanner;

public class Exercise2 {
	public static void guguPrint(int x){
		for(int i = 1; i<=9;i++) {
			System.out.println(x + "*" + i +"=" + x*i);
		}
		System.out.println();  //������ ���� �ǹ̾��� ��ġ.
	}
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int number = 0;
//		System.out.println("�ܼ��� �Է��ϼ���.");
//		
//		while((scanner.nextInt()) != -1){
//			guguPrint(number);
		int [][] arr = new int [3][5];
		int number = 0;
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = number ++;
			
			}
	
	
	
	}
	}
}
