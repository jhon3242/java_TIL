package Ex_43_instanceof;


class Car{
	String color;
	int door;
}

class FireEngine_2 extends Car{
	void water() {
		System.out.println("Water!!");
	}
}

class Ambulence_2 extends Car{
	void Am(){
		System.out.println("Ambulence~~~");
	}
}

public class Parent {
	static void dowork(Car c){
		if (c instanceof FireEngine_2){
			FireEngine_2 fe = (FireEngine_2) c;
			fe.water();
		}
		else{
			System.out.println("No fire engine");
		}
	}

	public static void main(String[] args) {
		Car c = new FireEngine_2();
		Car c_2 = new Car();
		dowork(c);
		dowork(c_2);

		FireEngine_2 fe = new FireEngine_2();
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof FireEngine_2);
	}
}
