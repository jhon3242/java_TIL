package Ex_60_java_lang_1;
//import Ex_60_java_lang_1.Point;

class Circle implements Cloneable{
	Point p;
	double r;

	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	public Circle shallowCopy(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return (Circle)obj;
	}

	public Circle deepCopy(){
		Object obj = null;
		try{
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
}

public class CloneEx3 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 2.0);
//		Circle c2 = c1.shallowCopy();
		Circle c2 = c1.deepCopy();

		c1.p.x = 2;
		System.out.println(c1.p.x);
		System.out.println(c2.p.x);     // c2 의 Point 인스턴스의 x 값 또한 2로 바뀌어있음
	}
}
