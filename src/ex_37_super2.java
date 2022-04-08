public class ex_37_super2 {
	public static void main(String[] args) {
		
	}
}

class Point_{
	int x;
	int y;
	
	Point_(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point_3D extends Point_{
	int z;
	
	Point_3D(int x, int y, int z){
//		this.x = x;   // 조상의 멤버 초기화.
//		this.y = y;   // 조상의 멤버 초기화.
		super(x, y);  // 조상클래스의 생성자 Point_(int x, int y)를 호
		this.z = z;
		
	}
}