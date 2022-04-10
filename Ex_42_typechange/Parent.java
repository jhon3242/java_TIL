package Ex_42_typechange;

class Car{
	String color;
	int door;
}

class FireEngine extends Car{
	void water() {}; // 물대포 기능
}

public class Parent {

	public static void main(String[] args) {
		Car c = new Car();

		FireEngine f = (FireEngine) c;

	}
}
