//// 상속관계.
//class Point{
//	int x;
//	int y;
//}
//
//class Circle extends Point{
//	int r; // 반지름.
//}
//public class Inheritance {
//	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.x = 1;
//		c.y = 1;
//		c.r = 5;		
//	}
//}

// 포함관계.
class Point{
	int x;
	int y;
}

class Circle{
	Point p = new Point();
	int r; // 반지름.
}
public class Inheritance {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 1;
		c.r = 5;		
	}
}
