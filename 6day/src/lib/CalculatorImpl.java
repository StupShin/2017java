package lib;

public class CalculatorImpl implements ICalculator{
	public int add(int a, int b){
		return a+b;
	}
	public int subtract(int a, int b){
		return a-b;
	}
	public double average(int a[]){
		double sum = 0;
		for(int num : a){
			sum +=num;
		}
		return sum/a.length;
	}
	public int mul(int a, int b){
		return a*b;
	}
	public void on(){
		System.out.println("°è»ê±â ON");
	}


}
