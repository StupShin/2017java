class Person{
	int age;
	public String name;
	protected int  height;
	private int weight;
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}	
}
//Exercise1
public class Student extends Person{

	void set(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		setWeight(weight);
	}
	void personInfo(Student s){
		System.out.println("�̸�: " + s.name + "����: " + s.age + "Ű: " + s.height + "������: " +s.getWeight());
	}
	public static void main(String[] args){
			Student s = new Student();
			s.set("Micael",  20, 170, 66);
			s.personInfo(s);
		}
	}