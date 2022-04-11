package Ex_46_interface;

interface PlayCard {
	public static final int SPACE = 4;
	final int DIAMOND = 3;  // public static final int
	static int HEART = 2;   // public static final int
	public int CLOVER = 1;  // public static final int

	public abstract String getCardNumber();
	String getCardKind();   //  public abstract String
}

interface Moveable{
	void move(int x, int y);
}

interface Attackable{
//	void attack(Units u);
}

class Figher implements Attackable {}

interface Fightable extends Moveable, Attackable {}

public class Ex_46 {
}
