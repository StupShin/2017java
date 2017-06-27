import java.util.Scanner;

class Goods3 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public Goods3(String n, int p, int nStock, int s){
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	public String getName() {
		return name;		
	}
	public int getPrice() {
		return price;		
	}
	public int getNumberOfStock() {
		return numberOfStock;		
	}
	public int getSold() {
		return sold;
	}	
}

public class GoodsArray {
	public static void main(String args []){
		Goods2 goodsArray[];
		goodsArray = new Goods2[3];
	
	Scanner s = new Scanner(System.in);
	for(int i = 0; i< goodsArray.length; i++) {
		String name = s.next();
		int price = s.nextInt();
		int n = s.nextInt();
		int sold = s.nextInt();
		goodsArray[i] = new Goods2(name, price, n, sold);
	}
	for(int i = 0; i<goodsArray.length; i++) {
		System.out.print(goodsArray[i].getName() + " ");
		System.out.print(goodsArray[i].getPrice() + " ");
		System.out.print(goodsArray[i].getNumberOfStock() + " ");
		System.out.println(goodsArray[i].getSold());
	}
	}
}
