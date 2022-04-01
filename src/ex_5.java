public class ex_5 {
	public static void main(String[] argc) {
		for (int i = 0; i < 10; i ++) {
			for (int j = 0; j < 10; j++)
			{
				System.out.printf("*");
				if (i == 5 && j == 5)
				{
					System.out.printf("5 and 5");
					break;
				}
			}
			System.out.println();
		}
//		loop1 : for (int i = 0; i < 10; i ++) {
//			for (int j = 0; j < 10; j++)
//			{
//				System.out.printf("*");
//				if (i == 5 && j == 5)
//				{
//					System.out.printf("5 and 5");
//					break loop1;
//				}
//			}
//			System.out.println();
//		}
	}
}
