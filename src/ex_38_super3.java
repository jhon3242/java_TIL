public class ex_38_super3 {
	public static void main(String[] args) {
		Point3D p3 = Point3D(2, 2, 3);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;		
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}