public class ex_6 {
	public static void main(String[] argc) {
		int[] score;
		score = new int[5];
		
		for (int i = 1; i < score.length; i++)
		{
			score[i] = i;
			System.out.println("score " + i + " = " + score[i]);
		}
		
		int[] math = new int[] {50, 40, 30, 20, 10}; 
		int[] english = {20, 60, 40, 20, 10};  //  더 많이 쓰는 방
		
		// 선언 이후 배열을 생성해야하는 경
		int[] art;
		// art = {10, 20, 30, 40}; // 이 방식은 에러가 발생함.
		art = new int[] {10, 20, 30, 40}; // 따라서 이방식을 사용함.
	}
}
