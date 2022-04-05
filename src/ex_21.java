public class ex_21 {
	public static void main(String[] argc) {
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("x : " + d.x);
		change(d);
		System.out.println("x : " + d.x); // x 의 값이 바
	}
	static void change(Data1 d) {
		d.x = 50;
		System.out.println("x : " + d.x);
	}
}

class Data1{
	int x;
}

