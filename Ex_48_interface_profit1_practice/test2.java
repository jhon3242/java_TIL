package Ex_48_interface_profit1_practice;

import Ex_48_interface_profit1.Unit;

interface I {
	void method_b2();
}

class B2 implements I{
	public void method_b2(){
		System.out.println("method_b2 !");
	}
}

class C implements I {
	public void method_b2(){
		System.out.println("Im not method b2 !!");
	}
}

class A2{
	void method_a2(I i){  // 인터페이스 I 를 구현한 놈들만 와라
		i.method_b2();
	}
}

public class test2 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.method_a2(new C());
	}
}

