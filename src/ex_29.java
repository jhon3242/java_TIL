public class ex_29{
	public static void main(String[] args) {
		System.out.println("a");
	}
}

class Card2{
	String color;
	String kind;
	int num;
	
	Card2() {
//		color = "red";
//		kind = "heart";
//		num = 10;
		this("red", "heart", 10);
	};
	Card2(String color){
		this(color, "heart", 10);
	}
	Card2(String color, String kind, int num){
		this.color = color;
		this.kind = kind;
		this.num = num;
	}
}
