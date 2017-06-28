class Person{
	
}
class Student extends Person{
	
}
class Researcher extends Person{
	
}
class Professor extends Researcher{
	
}//업캐스팅

public class InstanceOfExample {
	public static void main(String args[]){
		
		Person jee = new Student();
		Person Kim = new Professor();
		Person lee = new Researcher();
			//student  는 다운캐스팅.을 해야 확인가능
		if(jee instanceof Student)
			System.out.println("jee is Student");
		if(jee instanceof Researcher)
			System.out.println("jee is Researcher");
	}
}
