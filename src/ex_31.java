public class ex_31{
	public static void main(String[] args) {
		System.out.println("a");
	}
}

class InitTest{
	int x;
	int y = x;
	
	void method1() {
		int x;
		int y = x; // 에러 발
	}
}
