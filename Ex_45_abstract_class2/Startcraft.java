package Ex_45_abstract_class2;

import java.util.Vector;

abstract class Unit{
	int x, y;                           // 현재위치
	abstract void move(int x, int y);
	void stop() {/* 현재 위치에 정지*/};
}

class Marin extends Unit{ // 보병
	void move(int x, int y) {};
	void stimPack(){/* 스팀팩을 사용한다 */};
}

class Tank extends Unit{ // 탱크
	void move(int x, int y) {};
	void changeMode(){/* 공격모드 전환 */};
}

class Dropship extends Unit{ // 수송선
	void move(int x, int y) {};
	void load(){/* 선택 대상을 태운다 */};
	void unload(){/* 선택 대상을 내린다 */};
}

public class Startcraft {
	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marin();
		group[1] = new Tank();
		group[2] = new Dropship();

		for(int i = 0 ; i<group.length ; i++)
			group[i].move(200, 100);
    }

}

//class Marin { // 보병
//	int x, y;                           // 현재위치
//	void move(int x, int y) {/* 지정된 위치로 이동 */ };
//	void stop() {/* 현재 위치에 정지*/};
//	void stimPack(){/* 스팀팩을 사용한다 */};
//}
//
//class Tank { // 탱크
//	int x, y;                           // 현재위치
//	void move(int x, int y) {/* 지정된 위치로 이동 */ };
//	void stop() {/* 현재 위치에 정지*/};
//	void changeMode(){/* 공격모드 전환 */};
//}
//
//class Dropship { // 수송선
//	int x, y;                           // 현재위치
//	void move(int x, int y) {/* 지정된 위치로 이동 */ };
//	void stop() {/* 현재 위치에 정지*/};
//	void load(){/* 선택 대상을 태운다 */};
//	void unload(){/* 선택 대상을 내린다 */};
//}
