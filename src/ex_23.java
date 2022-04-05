public class ex_23 {
	public static void main(String[] argc) {
		int a = 3;
		System.out.println(sum(a, 4));
//		System.out.println(minus(a, 4));
		ex_23 tmp = new ex_23();
		System.out.println(tmp.minus(a, 4));
	}
	static int sum(int x, int y) {return x + y;}
	int minus(int x, int y) {return x - y;}
}


