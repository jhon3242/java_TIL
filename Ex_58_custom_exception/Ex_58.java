package Ex_58_custom_exception;

class MyException extends Exception {
	private final int ERR_CODE;

	MyException(String msg, int errCode){       // 생성자
		super(msg);
		ERR_CODE = errCode;
	}
	MyException(String msg){        // 생성자
		this(msg, 100);             // 에러코드를 100(기본값)으로 초기화
	}
	public int getErrCode(){        // 에러코드를 얻을 수 있는 메서드 추가
		return ERR_CODE;
	}
}

//class MyException extends Exception {
//	MyException (String msg){
//		super(msg);     // 조상인 Exception 클래스의 생성자를 호출한다
//	}
//}

public class Ex_58 {

}
