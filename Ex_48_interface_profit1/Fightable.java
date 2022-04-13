package Ex_48_interface_profit1;

public interface Fightable extends Walkable{
	void move(int x, int y);
	void attack(Fightable f);
}
