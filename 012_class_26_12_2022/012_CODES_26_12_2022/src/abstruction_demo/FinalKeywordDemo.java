package abstruction_demo;

public class FinalKeywordDemo {
	final int a = 10;
	int b = 20;
	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		// demo.a = 20; // can not do it because of final key word
		demo.b = 50;
		System.out.println(demo.a); // 10
		System.out.println(demo.b); // 50
	}
}
