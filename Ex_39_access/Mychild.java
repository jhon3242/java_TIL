package Ex_39_access;

public class Mychild {
	private int     pvt;
	int             dft;
	protected int   prt;
	public int      pub;

	void print_member(){
		System.out.println(pvt);    // OK
		System.out.println(dft);    // OK
		System.out.println(prt);    // OK
		System.out.println(pub);    // OK
	}
}

class Myparent {
	public static void main(String[] args) {
		Mychild p = new Mychild();
//		System.out.println(p.pvt);      //에러 발생
		System.out.println(p.dft);      //OK
		System.out.println(p.prt);      //OK
		System.out.println(p.pub);      //OK
	}
}
