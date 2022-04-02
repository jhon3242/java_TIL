import java.util.Arrays;

public class ex_14 {
	public static void main(String[] argc) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] tmp = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(tmp)); // [1, 2, 3, 4, 5]
		
		int[] tmp1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(tmp1)); // [1, 2]
		
		int[] tmp2 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(tmp2)); //  [3, 4]

		int[] tmp3 = Arrays.copyOfRange(arr, 2, 7);
		System.out.println(Arrays.toString(tmp3)); //  [3, 4, 5, 0, 0]
	}
}	
