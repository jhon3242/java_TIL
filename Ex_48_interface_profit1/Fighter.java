package Ex_48_interface_profit1;

public class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {};
	public void attack(Fightable f) {};
	public void walk() {};

	Fightable method(){
		return new Fighter();
	}
}

class test {

}