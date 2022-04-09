package src.Ex_39_access;

public  class Myparent{     // 접근 제어자 default
	private int     prv;    // 같은 클래스
    int             dft;    // 같은 패키지
    protected int   prt;    // 같은 패키지 + 자손(다른 패키지)
	public int      pub;    // 접근 제한 없음


    public void printMembers(){
        System.out.println(prv);    // OK
        System.out.println(dft);    // OK
        System.out.println(prt);    // OK
        System.out.println(pub);    // OK
    }
}
class Ex_1 {
    public static void main(String[] args) {
        Myparent p = new Myparent();
        System.out.println(p.prv);      // 에러
        System.out.println(p.dft);      // OK
        System.out.println(p.prt);      // OK
        System.out.println(p.pub);      // OK
    }
}
