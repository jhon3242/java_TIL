public class ex_28{
	public static void main(String[] args) {

		System.out.println(Math.st_add(100L, 200L));
		Math tmp = new Math();
		tmp.a = 100L;
		tmp.b = 200L;
		System.out.println(tmp.add());
	}
}

class Math {
	long a, b;
	
	long add() { // 인스턴스 메서
		return a + b;
	}
	
	static long st_add(long a, long b) { // 클래스 메서드(static 메서드)
		return a + b;
	}
}


