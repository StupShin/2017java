
public class Problem2 {
	public static void main(String args[]) {
		for(int i = 1; i<10; i++,System.out.println()) {
			for(int j = 1; j<10; j++,System.out.print(" " +'\t')){ //여기서 먼저 시작
				System.out.print("| " + j + "*" + i + "=" + i*j);
			}
		}
	}
}
