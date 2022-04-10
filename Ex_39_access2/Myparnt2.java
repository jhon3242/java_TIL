package Ex_39_access2;

import Ex_39_access.Mychild;

class Mychild2 extends Mychild {

	void print_member(){
//		System.out.println(pvt);    // 에버발생
//		System.out.println(dft);    // 에버발생
		System.out.println(prt);    // OK
		System.out.println(pub);    // OK
	}
}

public class Myparnt2 {
	public static void main(String[] args) {
		Mychild p = new Mychild();
//		System.out.println(p.pvt);      // 에러발생
//		System.out.println(p.dft);      // 에러발생
//		System.out.println(p.prt);      // 에러발생
		System.out.println(p.pub);      // OK

	}
}
