package Ex_50_inner_class;

class Outer{
	class Inner{
		static int sv = 100;
	}
}

//class Outer{
////	private int iv;
//	private class InstanceCalss {}
//
////	protected static int cv;
//	protected static class StaticClass {}
//
//	void method(){
////		int lv;
//		class LocalClass {}
//	}
//}



class A{
	int a_variable;
	class B{
		void test(){
			a_variable = 3;  // 객체의 생성이 필요없다,
		}

	}
}

// 내부 클래스가 아닌 경우 클래스 A 의 멤버에 접근하려면 객체를 생성해야한다.
//class A{
//	int i;
//}
//
//class B{
//	void method(){
//		A a = new A();
//		System.out.println(a.i);
//	}
//}

public class Ex_50 {
	class Test{
		static int sv = 100;
	}

}
