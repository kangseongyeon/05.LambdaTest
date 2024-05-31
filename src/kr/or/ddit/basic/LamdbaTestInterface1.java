package kr.or.ddit.basic;

// @FunctionalInterface : 추상 메서드가 1개

@FunctionalInterface
public interface LamdbaTestInterface1 {
	// 반환값이 없고, 매개변수도 없는 추상메서드 선언
	public void test();
}

@FunctionalInterface
interface LamdbaTestInterface2 {
	// 반환값이 없고, 매개변수는 있는 추상메서드 선언
	public void test(int a);
}

@FunctionalInterface
interface LamdbaTestInterface3 {
	// 반환값이 있고, 매개변수도 있는 추상메서드 선언
	public int test(int a, int b);
}
