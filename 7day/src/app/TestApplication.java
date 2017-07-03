package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import lib.Attendance;
import lib.Grade;
import lib.IAttendance;
import lib.IGrade;
import lib.ITest;
import lib.Test;

public class TestApplication {
	public static void main(String[] args){
		LinkedList<String> nameList = new LinkedList<String>();
		
		Scanner scanner = new Scanner(System.in);
		String name;
		
		System.out.println("���ǿ� ���� ������� �Է��ϼ���(����л� ���: �ϴ� ���� ���� ���� �¾� [�Է��� ��ġ�� end�� ���� �Է�]) >>");
		while (!(name = scanner.next()).equals("end")){
			nameList.addFirst(name);
		}
		IAttendance at = new Attendance();
		at.checkAttendance(nameList);
		at.showAttendance();
		
		System.out.println();
		System.out.println("_____");
		System.out.println("������ ���� ���� ���� ������ ����ϴ�.");
		System.out.println("_____");
		System.out.println();
		
		ArrayList<String> problems = new ArrayList<String>();
		problems.add("���̻纯");
		problems.add("�Ź̾��");
		problems.add("���ξ��");
		problems.add("��������");
		problems.add("���ȣ���");
		
		ITest test = new Test();
		test.makeTest(problems);
		IGrade grade = new Grade(test.doTest(nameList));
		grade.notifyGrade();
	}
}
