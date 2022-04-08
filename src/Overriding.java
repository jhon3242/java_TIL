class Point{
	int x;
	int y;
	String getlocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z;
	String getlocation() { //  조상의 getlocation 을 오버라이딩.
		return "x : " + x + ", y : " + y + ", : z : " + z;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.x = 3;
		p.y = 3;
		p.z = 3;
		System.out.println(p.getlocation());
	}
}
