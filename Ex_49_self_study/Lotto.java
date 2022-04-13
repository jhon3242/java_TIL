package Ex_49_self_study;

import java.util.Scanner;
import java.util.Vector;

public class Lotto{
	static void start(User user, Opimp op){
		Vector tmp;
		user.answer = op.make_arr(user.size); // 정답 생성
		do{
			if (user.count != 0)
				System.out.println("틀렸습니다..");
			System.out.printf("%d 회차 시도 : ",user.count);
			tmp = op.make_arr(user.size);
			op.vectorToString(tmp);
			user.count++;
		}while (!tmp.equals(user.answer));
		System.out.println("정답입니다!! \n ------------------- \n 정답 : ");
		op.vectorToString(tmp);
	}
	static void setting(){
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		int pick = 0;

		while (true){
			System.out.println("난이도를 숫자를 입력해주세요 : ");
			pick = scanner.nextInt();
			if (pick <= 0){
				System.out.println("0보다 큰 숫자를 입력해주세요");
				pick = 0;
				continue;
			}
			user.size = pick; // 난이도 입력
			break;
		}
		while (true){
			System.out.println("1. 자동 뽑기");
			System.out.println("2. 수동 뽑기");
			System.out.println("모드 입력해주세요 : ");
			pick = scanner.nextInt();
			if (pick != 1 && pick != 2){
				System.out.println("잘못된 숫자를 입력하셨습니다");
				continue;
			}
			user.mode = pick; // 모드 입력
			break;
		}
		if (user.mode == 1)
			start(user, new Op()); // 자동모드 게임 시작
		else
			start(user, new Self_op()); // 수동모드 게임 시작
	}
	public static void main(String[] args) {
		while (true){
			System.out.println("Lotto Program!!");
			System.out.println();
			System.out.println("1. 시작하기");
			System.out.println("2. 종료하기");
			System.out.println("메뉴를 선택해주세요 : ");
			Scanner scanner = new Scanner(System.in);
			int pick = scanner.nextInt();

			if (pick == 1){
				setting();// 시작
			}
			else if (pick == 2){
				System.out.println("프로그램이 종료되었습니다.");
				return ;
			}
			else {
				System.out.println("잘못된 숫자를 입력했습니다.");
			}
		}
	}
}