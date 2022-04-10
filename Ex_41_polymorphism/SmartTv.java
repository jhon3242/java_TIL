package Ex_41_polymorphism;

class Tv{
	boolean power;
	int     channel;

	void    powerUp() { power= !power;};
	void    channedlUp() {++channel;};
	void    channedlDown() {--channel;};
}

public class SmartTv extends Tv {
	String text; // 자막 기능
	void caption() {}; // 생략

}
