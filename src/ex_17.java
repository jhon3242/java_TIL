public class ex_17 {
	public static void main(String[] argc) {
		Tv i = new Tv();
		System.out.println(i); // Tv@3234e239
		Tv j = new Tv();
		System.out.println(i); // Tv@36b4cef0
		
		i.channel = 2;
		i.channel_down();
		System.out.println(i.channel);
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