package Ex_57_finally;

public class Ex_57 {
	public static void main(String[] args) {
		try{
			return;
		} catch (Exception e){
			// 예외 처리 문장
		} finally{
			System.out.println("finally 구문이 실행되었습니다.");
		}
	}
}
