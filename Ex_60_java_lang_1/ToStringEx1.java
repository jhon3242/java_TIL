package Ex_60_java_lang_1;

class Card{
	String kind;
	int number;

	Card(){
		this("SPACE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString(){
		return "kind : " + kind + ", number : " + number;
	}
}

class CardToString{
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());  // kind : SPACE, number : 1
		System.out.println(c2.toString());  // kind : SPACE, number : 1
	}
}

class ToStringEx1 {
}


