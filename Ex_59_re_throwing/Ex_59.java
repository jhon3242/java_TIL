package Ex_59_re_throwing;

public class Ex_59 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e){
			System.out.println("main 에서 예외를 처리했습니다.");
		}
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e){
			System.out.println("method1 에서 예외를 처리했습니다.");
			throw e;
		}
	}
}
