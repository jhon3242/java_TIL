package Ex_60_java_lang_1;

class Point implements Cloneable{
	int x, y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Object clone(){
		Object obj = null;
		try{
			obj = super.clone();    // clone() 은 반드시 예외처리를 해주어야 한다.
		} catch (CloneNotSupportedException e) {}
		return obj;
	}
	public String toString(){
		return "x : " + x + ", y : " + y;
	}
}

public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3, 4);
		Point copy = (Point) original.clone();

		System.out.println(original);        // x : 3, y : 4
		System.out.println(copy);            // x : 3, y : 4
	}
}
