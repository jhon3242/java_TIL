package Ex_44_polymorphism_profit2;

class Product{
	int price;  // 제품 가격
	int bonus;  // 제품 구매시 보너스 점수

	Product(int price){
		this.price = price;
		this.bonus = (int)(price / 10.0);
	}
	Product() {}; // 기본 생성자
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
	Product[] item = new Product[10];   // 구입한 제품을 저장하기 위한 배열
	int i = 0;          // Product 배열 item 에 사용될 index

	Buyer(){}; // 기본생성자
	Buyer(int money) {
		this.money = money;
	}

	void buy (Product p){
		if (money < p.price){
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return ;
		}
		money -= p.price;
		bonus_point += p.bonus;
		System.out.println(p + "를(을) 구매했습니다.");
		item[i++] = p; // 구입한 품목 배열에 추가
	}

	void summery(){
		int sum = 0;
		String item_list = "";
		for (int i = 0; i < this.i; i++){
			sum += item[i].price;
			item_list += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액 : " + sum);
		System.out.println("구입하신 물품의 목록 : " + item_list);
	}
}

public class Ex_44_second {
	public static void main(String[] args) {
		Buyer jake = new Buyer(10000);
		jake.buy(new Computer());
		jake.buy(new Audio());
		jake.buy(new Audio());
		jake.buy(new Tv());
		jake.summery();
	}
}
