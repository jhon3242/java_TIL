package Ex_54_try_catch;

public class Ex_54 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for (int i = 0; i<10 ; i++){
			try {
				result = number / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e){
				System.out.println(0);
			}
		}
//		try{
//			// 예외가 발생할 가능성이 있는 문장
//			try { } catch (Exception e) { }
//		} catch (Exception e1){
//			// Exception e1 이 발생할 경우, 이를 처리하기 위한 문장
//			try { } catch (Exception e1) {} // 에러 발생
//		} catch (Exception e1){
//			// Exception e2 이 발생할 경우, 이를 처리하기 위한 문장
//		} catch (Exception e1){
//			// Exception eN 이 발생할 경우, 이를 처리하기 위한 문장
//		}
	}
}
