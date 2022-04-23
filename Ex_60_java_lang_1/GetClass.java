package Ex_60_java_lang_1;

final class Card1{
	String kind;
	int num;

	Card1(String kind, int num){
		this.kind = kind;
		this.num = num;
	}

	Card1(){
		this("SPADE", 1);
	}

	public String toString(){
		return kind + " : " + num;
	}
}


public class GetClass {
	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 3);
		Card1 c2 = c.getClass();

	}

//	public static void main(String[] args) {
//		class cObj = new Card().getClass();     // 생성된 객체로 부터 얻는 방법
//		class cObj = Card.class;                // 클래스 리터럴(*.class)로 부터 얻는 방법
//		class cObj = Class.forName("Card");     // 클래스 이름으로 부터 얻는 방법
//	}
}
