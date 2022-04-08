public class ex_36_super {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x = 10;		// super.x
}

class Child extends Parent{
	int x = 20;		// this.x
	
	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}