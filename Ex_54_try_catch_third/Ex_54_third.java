package Ex_54_try_catch_third;

public class Ex_54_third {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("예외 메시지 : " + ae.getMessage());
		}

//		try {
//			System.out.println(5 / 0);
//		} catch (ExceptionA | ExceptionB e){
//			e.methodA(); // 에러. ExceptionA 에 선언된 methodA() 는 호출 불가
//			if (e instanceof ExceptionA){
//				ExceptionA e1 = (ExceptionA)e;
//				e1.methodA();
//			} else { // if (e instanceof ExceptionB)
//				...
//			}
//		}
	}
}
