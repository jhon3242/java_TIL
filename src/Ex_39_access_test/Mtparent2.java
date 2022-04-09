package src.Ex_39_access_test;

import src.Ex_39_access.Myparent;

class Child extends Myparent {
        System.out.println(prv);    // 에러발생
        System.out.println(dft);    // 에러발생
        System.out.println(prt);    // OK
        System.out.println(pub);    // OK
}

public class Mtparent2 {
	public static void main(String[] args) {
		Myparent p = new Myparent();
		System.out.println(p.prv);    // 에러발생
		System.out.println(p.dft);    // 에러발생
		System.out.println(p.prt);    // 에러발생
		System.out.println(p.pub);    // OK
	}
}
