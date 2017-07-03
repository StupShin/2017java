package lib;

import java.util.*;

public class Grade implements IGrade{
	private Set<String> keys;
	private Iterator<String> it;
	private HashMap<String,String> result;
	
	public Grade(HashMap<String,String> result){
		this.result = result;
		keys = this.result.keySet();
		it = keys.iterator();
	}
	public void notifyGrade(){
		System.out.println("<__테스트 결과__>");
		while(it.hasNext()){
			String name = it.next();
			String score = result.get(name);
			
			System.out.println(name + " : " + score);
		}
	}
}
