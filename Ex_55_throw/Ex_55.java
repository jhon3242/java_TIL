package Ex_55_throw;

public class Ex_55 {
	public static void main(String[] args) {
		try {
//			ArithmeticException e = new ArithmeticException("고의로 예외 발생시킴");
//			throw e;
			throw new ArithmeticException("고의로 발생 시킨 예외");
		} catch(ArithmeticException a) {
			a.printStackTrace();
			System.out.println(a.getMessage());
		} catch (Exception e){
			System.out.println("Exception");
		}
	}
}
