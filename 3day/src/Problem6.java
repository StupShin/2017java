import java.util.Scanner;

public class Problem6 {
	public static void main(String args[]) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = rd.nextInt();
		System.out.print("�������� �Է��Ͻÿ�: ");
		divisor = rd.nextInt();
		try{

			System.out.println(dividend + "��" + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
			
		}
		catch(ArithmeticException e) {
			System.out.println("0�� �Է��ϼ̽��ϴ�.");
		}
		finally{
			System.out.println("��");
		}
		}
}