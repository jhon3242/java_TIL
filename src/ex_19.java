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
		
		c1.width = 150;      // 가능은 하지만 비추천
		Card.high = 200;     // 클래스 이름을 사용하는 방식 추
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