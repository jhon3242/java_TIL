import java.util.Arrays;

public class ex_12 {
	public static void main(String[] argc) {
		int[] arr = {10, 11};
		int[][] arr2d = {{10, 11}, {20, 21}};
		
		System.out.println(Arrays.toString(arr)); // [10, 11]
		System.out.println(Arrays.toString(arr2d)); // [[I@3234e239, [I@3d921e20]
		System.out.println(Arrays.deepToString(arr2d)); // [[10, 11], [20, 21]]

	}
}
