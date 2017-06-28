//Problem3
class DObject{
	public void draw(){
		System.out.println("DObject darw");
	}
}
class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends DObject {
	public void darw() {
		System.out.println("Rect");
	}
}
class Circle extends DObject {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	public static void main(String args[]){
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line(); //up-casting
		DObject r = line; //pointer?
		
		obj.draw();
		line.draw();
		p.draw();
		r.draw();
		
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw();
		circle.draw();
		
	}
}
