package Ex_44_polymorphism_profit;

class Product{
	int price;  // 제품 가격
	int bonus;  // 제품 구매시 보너스 점수

	Product(int price){
		this.price = price;
		this.bonus = (int)(price / 10.0);
	}
}

class Tv extends Product {
	Tv(){super(100);}
	public String toString() {return "TV"; };
}

class Computer extends Product {
	Computer(){super(50);}
	public String toString() {return "Computer"; };
}

class Audio extends Product {
	Audio(){super(20);}
	public String toString() {return "Audio"; };
}

class Buyer{
	int money;          // 구매자의 자본
	int bonus_point;    // 구매자의 보너스 점수

	Buyer(){};
	Buyer(int money) {
		this.money = money;
	}

	void buy (Product p){
		money -= p.price;
		bonus_point += p.bonus;
		System.out.println(p + "를(을) 구매했습니다.");
	}
}

public class Ex_44 {
	public static void main(String[] args) {
		Buyer jake = new Buyer(1000);
		System.out.println(jake.money);
		jake.buy(new Computer());
		System.out.println(jake.money);
		System.out.println(jake.bonus_point);
	}
}
