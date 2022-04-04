public class ex_18 {
	public static void main(String[] argc) {
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		Tv t3 = new Tv();
		
		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
		tvArr[1].channel = 2;
	}
}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = power;}
	void channel_up() {channel++;}
	void channel_down() {channel--;}
}