class Person{
	
}
class Student extends Person{
	
}
class Researcher extends Person{
	
}
class Professor extends Researcher{
	
}//��ĳ����

public class InstanceOfExample {
	public static void main(String args[]){
		
		Person jee = new Student();
		Person Kim = new Professor();
		Person lee = new Researcher();
			//student  �� �ٿ�ĳ����.�� �ؾ� Ȯ�ΰ���
		if(jee instanceof Student)
			System.out.println("jee is Student");
		if(jee instanceof Researcher)
			System.out.println("jee is Researcher");
	}
}
