package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;

public class T03LambdaTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("김민강");
		list.add("이현수");
		list.add("권기혁");
		
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("--------------------------");
		
		list.forEach(name -> System.out.println(name));
		
		/////////////////////////////////////////////
		
		// 메서드 참조 (::를 쓴 것)
		// 메서드 참조 -> System.out 객체가 제공해주는 println을 사용해서 forEach문을 사용
		list.forEach(System.out::println);
		
		/////////////////////////////////////////////
		
		/* 메서드 참조의 일반적인 형태
		 * 
		 * 참조변수::인스턴스메서드명
		 * 클래스명::정적메서드명
		 * 클래스명::인스턴스메서드명
		 * 생성자명::new
		 */
		
		MyPrint mp = new MyPrint();
		
		System.out.println();
		System.out.println("참조변수::인스턴스메서드명 ...");
		list.forEach(mp::printName);
		
		System.out.println();
		System.out.println("클래스명::정적메서드명...");
		list.forEach(MyPrint::printName2);
		
		System.out.println();
		System.out.println("생성자명::new...");
		list.forEach(MyPrint::new);
	}
}

class MyPrint {
	// 생성자 -> return 타입 없음
	public MyPrint() {
		// TODO Auto-generated constructor stub
	}
	
	// 파라미터가 있는 생성자
	public MyPrint(String name) {
		System.out.println("생성자에서 출력함... : " + name);
	}
	
	public void printName(String name) {
		System.out.println("name : " + name);
	}
	
	public static void printName2(String name) {
		System.out.println("name : " + name);
	}
}