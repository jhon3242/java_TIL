package Ex_51_inner_class_static;

public class Ex_51 {
	class InstanceInner {}
	static class StaticInner {}

	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();

	static void staticMethod(){
//		InstanceInner obj1 = new InstanceInner();  // 에러발생
		StaticInner obj2 = new StaticInner();

	}
	void instanceMethod(){
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
//		LocalInner lv = new LocalInner();  // 에러 발생
	}
	void myMethod(){
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
