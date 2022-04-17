package Ex_56_throws;

public class Ex_56 {
	public static void main(String[] args){
		try{
			method1();
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	static void method1() throws Exception{
		throw new Exception("고의로 발생시킨 예외");
	}


//	public static void main(String[] args) {
//		method1();
//	}
//	static void method1() {
//		try{
//			throw new Exception("고의로 예외 발생");
//		} catch (Exception e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}


//	public static void main(String[] args) throws Exception{
//		method1();
//	}
//	static void method1() throws Exception {
//		method2();
//	}
//	static void method2() throws Exception{
//		throw new Exception("고의로 예외 발생");
//	}
}
