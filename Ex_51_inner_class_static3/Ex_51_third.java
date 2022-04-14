package Ex_51_inner_class_static3;




class Outer{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod(){
		class LocaalInner{
			int iv =400;
		}
	}
}

public class Ex_51_third {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.InstanceInner ii = out.new InstanceInner();  // 외부 클래스 객체를 먼저 만들어야 내부 클래스 객체를 만들 수 있음

		System.out.println(ii.iv);
		System.out.println(Outer.StaticInner.cv); // 객체의 생성 없이 접근 가능

		Outer.StaticInner si = new Outer.StaticInner(); // static 내부 클래스 객체는 외부 클래스의 객체 생성 없이 생성가능
		System.out.println(si.iv);
	}
}
