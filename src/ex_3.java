import java.util.Scanner;
public class ex_3 {
	public static void main(String[] argc) {
		System.out.println("몇월 인가요? : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 입니다.");
			break;
		default:
			System.out.println("겨울 입니다.");
		}
	}
}
