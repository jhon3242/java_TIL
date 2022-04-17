package Ex_58_custom_exception_second;



public class Ex_58_second {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e){
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후 다시 설치하시길 바랍니다.");
		} catch (MemoryException me){
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();         // Garbage Collection 을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempfiles();  // 프로그램 설치에 사용된 임시파일을 삭제한다.
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("설치 공간이 부족합니다.");
		if (!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}

	static void copyFiles() { /* 파일들을 복사하는 코드 */}
	static void deleteTempfiles() { /* 임시파일들을 삭제하는 코드 */}
	static boolean enoughSpace() {
		// 설치하는데 필요 공간이 있는지 확인하는 코드
		return false;
	}
	static boolean enoughMemory() {
		// 설치하는데 필요 메모리공간이 있는지 확인하는 코드
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}