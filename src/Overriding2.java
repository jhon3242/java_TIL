class Point2{
	int x;
	int y;
	public String toString() {
		return "x : " + x + ", y : " + y; 
	}
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Overriding2 {
	public static void main(String[] args) {
		Point2 p = new Point2(1, 1);
		System.out.println(p.toString());  // x : 1, y : 1
		System.out.println(p);   // x : 1, y : 1
	}
}
