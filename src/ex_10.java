public class ex_10 {
	public static void main(String[] argc) {
		int[][] arr_1 = new int [][] {{1, 2, 3}, {4, 5, 6}};
		int[][] arr_2 = {{1, 2, 3}, {4, 5, 6}};
		int[][] arr_3 = {
							{1, 2, 3}, 
							{4, 5, 6}
						};
		int[][] arr = {
				{11, 12, 13},
				{21, 22, 23},
				{31, 32, 33}
		};
		for (int i = 0; i < arr.length; i ++)
		{
			for (int j = 0; j < arr[i].length; j++)
				System.out.printf("arr[%d][%d] : %d ", i, j, arr[i][j]);
			System.out.println();
		}
		
		
	}
}
