package Ex_45_abstract_class;

abstract class Player{              // 추상 클래(미완성 클래스)
	abstract void play(int pos);    // 추상 메서드(몸통이 없는 미완성 메서)
	abstract void stop();           // 추상 메서드
}

class AudioPlayer extends Player{
	void play(int pos) {};          // 추상 메서드 구현
	void stop() {};                 // 추상 메서드 구현
}

public class Ex_45 {
}
