import java.util.Scanner;

public class Exercies3 {
	
	public static boolean isAlphabet(char a) {
		if((a >='A' && a<= 'Z') ||  (a>='a' && a<='z'))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		char result = 0;
		char input = a.next().charAt(0); //사라지지 않게 char에 담아두기
		if(isAlphabet(input) == false){
			System.out.println("영문자가 아닙니다.");
		}
		else{
			if(Character.isUpperCase(input)){
				result = Character.toLowerCase(input);
			}
			else
				result = input;
		}
		System.out.println(""+result);	
				}
}