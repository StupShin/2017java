
public class Ecercise2 {
	public static double rectangle(double sx,double sy,double ex,double ey){
	return (ex-sx)*(ey-sy);
	}
	public static double circle(double radius) {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("(0,0)에서 (3,4)까지 마우스를 드래그한 사각형의 면적은" + rectangle(0,0,3,4) + "입니다");
		System.out.println("원의 반지름이 3일 때 원의 면적은"+ circle(3.0) + "입니다");
		
		
		
	}
	
}
