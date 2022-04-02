import java.util.Arrays;

public class ex_13 {
	public static void main(String[] argc) {
		int[] arr = {10, 11};
		int[][] arr2d = {{10, 11}, {20, 21}};
		
		int[] tmp_arr = {11, 10};
		int[][] tmp_arr2d = {{10, 11}, {20, 21}};
		System.out.println(Arrays.equals(arr, tmp_arr)); // false
		System.out.println(Arrays.deepEquals(arr2d, tmp_arr2d)); // true
	}
}
