
public class Exercise1 {
	public static int Max(int n, int m){
		if(n==m)
			return 0;
	else if(n>m)
			return n;
		else 
			return m;
	}
	public static double Max(double n, double m){
		if(n==m)
			return 0;
	else if(n>m)
			return n;
		else 
			return m;
	}
	
	
	public static void main(String[] args) {//���α׷��� ���۵Ǵ� �帧?
		int i = 4;
		int j = 3;
		int M;
		
		M = Max(i,3);
		
		System.out.print(i + " �׸���" + j +  " �� ū ���� ");
		System.out.print(M + "�Դϴ�");
	}
}
