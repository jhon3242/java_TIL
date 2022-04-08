import java.util.m

public class ex_32{
	public static void main(String[] args) {
		System.out.println("a");
	}
}

class staticBlock{
	static int[] iarr = new int[10];  // 명시적 초기화.
	static { // 클래스 블록 초기화 - 배열 iarr 에 난수로 채운다.
		for (int i = 0; i < iarr.length; i++)  
			iarr[i] = (int)(Math.random()*10 + 1);
	}
}