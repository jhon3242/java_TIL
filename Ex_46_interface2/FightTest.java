package Ex_46_interface2;

public class FightTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)
			System.out.println("Unit 클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println(" Fightable 클래스의 자손입니다.");
		if (f instanceof Moveable)
			System.out.println(" Moveable 클래스의 자손입니다.");
		if (f instanceof Attackable)
			System.out.println(" Attackable 클래스의 자손입니다.");
		if (f instanceof Object)
			System.out.println(" Object 클래스의 자손입니다.");
	}
}

class Fighter extends Unit implements Fightable{
	public void attack(Unit u ) {};
	public void move(Unit u) {};
}

class Unit{
	int currentHP;
	int x,y;
}

interface Fightable extends Attackable, Moveable { }
interface Attackable { void attack(Unit u) ; }
interface Moveable { void move(Unit u) ; }
