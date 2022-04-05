public class ex_20 {
	public static void main(String[] argc) {
		Data d = new Data();
		d.x = 10;
		System.out.println("x : " + d.x);
		change(d.x);
		System.out.println("x : " + d.x);
		
		
	}
	static void change(Data d) {
		d.x = 50;
		System.out.println("x : " + d.x);
	}
}

class Data{
	int x;
}

