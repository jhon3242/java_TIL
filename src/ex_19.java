public class ex_19 {
	public static void main(String[] argc) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.number);
		System.out.println(c2.number);
		                      
		c1.number = 150;      
		System.out.println(c1.number);
		System.out.println(c2.number);
		
		System.out.println();
		
		System.out.println(c1.width);
		System.out.println(c2.width);
		
		c1.width = 150;      
		System.out.println(c1.width);
		System.out.println(c2.width);
	}
}

class Card{
	String kind;
	int number;
	
	static int width = 100;
	static int high = 250;
}