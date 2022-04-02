import java.util.Arrays;

public class ex_8 {
	public static void main(String[] argc) {
		int[] iarr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n;
		int tmp;
		for (int i = 0; i < 50; i ++) {
			n = (int)(Math.random() * 10);
			tmp = iarr[0];
			iarr[0] = iarr[n];
			iarr[n] = tmp;
		}
		System.out.println(Arrays.toString(iarr));  // [2, 9, 4, 5, 8, 0, 6, 1, 7, 3]
	}
}
