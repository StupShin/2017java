//Exercise1
import java.util.Scanner;
class Book{
	private String title;
	private String author;
	private int ISBN;
	
	public Book(String t, String a, int i){
		title = t;
		author = a;
		ISBN = i;		
	}
	public Book(String t, int i){
		title = t;
		ISBN = i;
	}
	public Book(){		
		this(null,null,0);
		}//null or 0.
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	int getISBN(){
		return ISBN;
	}
}

public class Library {
	public static void main(String[] args) {
	
		System.out.println("타이틀, 저자, 국제표준도서번호를 순서대로 입력하세요.");
		
		Book book = new Book[3];
		Scanner scanner = new Scanner(System.in);
		
		for(i = 0; i<scanner.length; i++){
		String a = scanner.next();
		String b = scanner.next();
		int c = scanner.nextInt();

		System.out.println("제목: " + a + "저자: " + b + "국제표준도서번호: " + c);
		}
		}
	}

