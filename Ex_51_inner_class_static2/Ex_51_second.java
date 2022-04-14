package Ex_51_inner_class_static2;

public class Ex_51_second {
	private int outerlv = 0;
	static int outercv = 0;

	class InstanceInner{
		int iiv = outerlv;  // private 는 같은 클래스 내에서 접근 가능이여서 당연히 가능하다.
		int iiv2 = outercv;
	}
	static class StaticInner{
//		int siv = outerlv;  // static 변수와 마찬가지로 static 내부 클래스는 외부 클래스 인스턴스 멤버에 접근할 수 없다.
		static int scv = outercv;
	}
	void myMethod(){
		int lv = 0;
		final int LV = 0;    // final 생략가능
		class LocalInner{
			int liv = outerlv;
			int liv2 = outercv;
			int liv3 = lv; // JDK1.8 이후부터는 에러발생 안함, 자동으로 컴파일러가 변수 앞에 final 을 붙이기 때문
			int liv4 = LV;

			void method(){
				System.out.println(lv);
			}
		}
	}
}
