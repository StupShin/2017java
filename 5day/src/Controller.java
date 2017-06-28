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
		System.out.println("�Ǽ��ָ�");
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
		System.out.println("���� �� ������ ��ġ��(" + this.x + "," + this.y + ") �Դϴ�.");
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
		System.out.println("�εεεεεε�.");
	}
	public void talk(){
		System.out.println("Go,GO,Go....");
	}
	public void steamPack(){
		attackSpeed++;
		System.out.println("���� ���ݼӵ��� " + attackSpeed);
	}
}
class Medic extends Unit{
	private int MP;
	
	public void attack(){
		System.out.println("�� ������ ������ �� �� �����ϴ�.");
	}
	public void talk(){
		System.out.println("e������ �ʿ��ϸ�");
	}
}



public class Controller {
	public static void main(String[] args) {

	}
}
