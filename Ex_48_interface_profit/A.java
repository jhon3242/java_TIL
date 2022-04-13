package Ex_48_interface_profit;

class A{
	public void method_a(I i){
		i.method();
	}
}

class B implements I{
	public void method(){
		System.out.println("method B");
	}
}

class C implements I{
	@Override
	public void method() {
		System.out.println("method C");
	}
}

interface I{
	void method();
}

class InterfaceTest{
	public static void main(String[] args) {
		A a = new A();
		a.method_a(new C());
	}
}

//class A {
////	public void method_a(B b){
////		b.method();
////	}
//	public void method_a(C c){
//		c.method();
//	}
//}
//
//class B{
//	public void method(){
//		System.out.println("method b");
//	}
//}
//
//class C{
//	public void method(){
//		System.out.println("method C");
//	}
//}
//
//class InterfaceTest{
//	public static void main(String[] args) {
//		A a = new A();
//		a.method_a(new C());
//	}
//}
