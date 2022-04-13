package Ex_48_interface_profit1_practice;

class C_ {
	public void method_b() {
		System.out.println("C method ");
	};
}

class B {
	public void method_b() {
		System.out.println("B method ");
	};
}

class A {
	public void method_a(B b){
		b.method_b();
	}
}

public class test {
	public static void main(String[] args) {
		A a = new A();
		a.method_a(new B());
	}
}
