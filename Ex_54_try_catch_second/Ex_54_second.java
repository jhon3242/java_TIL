package Ex_54_try_catch_second;

public class Ex_54_second {
	public static void main(String[] args) {
		try{
			System.out.println(5 / 0);
		}
		catch (ArithmeticException e){
			System.out.println(0);
		}
		catch (Exception e){
			System.out.println("Exception");
		}
	}
}
