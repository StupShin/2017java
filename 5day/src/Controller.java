class Unit {
	private int HP;
	private int strikingPower;
	private int defensivePower;
	private int x;
	private int y;

	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void attack() {
		System.out.println("맨손주먹");
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
		System.out.println("현재 이 유닛의 위치는(" + this.x + "," + this.y + ") 입니다.");
	}

	public void talk() {
		System.out.println("...");
	}
}
class Marine extends Unit{
	private int attackSpeed;
	public Marine(int x, int y){
		super(x,y);
		attackSpeed = 0;
	}
	public void attack(){
		System.out.println("두두두두두두둑.");
	}
	public void talk(){
		System.out.println("Go,GO,Go....");
	}
	public void steamPack(){
		attackSpeed++;
		System.out.println("현재 공격속도는 " + attackSpeed);
	}
}
class Medic extends Unit{
	private int MP;
	
	public void attack(){
		System.out.println("이 유닛은 공격을 할 수 없습니다.");
	}
	public void talk(){
		System.out.println("e도움이 필요하면");
	}
}



public class Controller {
	public static void main(String[] args) {

	}
}
