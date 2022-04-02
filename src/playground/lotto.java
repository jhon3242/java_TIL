package playground;

import java.util.Arrays;
import java.util.Scanner;

public class lotto {
	public static int[] random() {
		int[] choice_arr = new int[3];
		int n;
		int j;
		j = 0;
		loop1 : while (j < choice_arr.length)
		{
			n = (int)(Math.random() * 45) + 1;
			for (int i = 0; i < choice_arr.length; i++)
				if (choice_arr[i] == n)
					continue loop1;
			choice_arr[j++] = n;	
		}
		return (choice_arr);
//		System.out.println(Arrays.toString(choice_arr));
	}
	public static void select(int[] win_arr){
		System.out.println("random : 0 ");
		System.out.println("select yourself : 1 ");
		System.out.println("Chose your choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int[] user_arr;
		int try_num = 0;
		
		Arrays.sort(win_arr);
		while (true)
		{
			try_num++;
			if (choice == 0)
				user_arr = random();
			else
			{
				System.out.println("Sorry I didn't make it yet");
				user_arr = null;
				return ;
			}
			Arrays.sort(user_arr);
			if (Arrays.equals(user_arr, win_arr))
			{
				System.out.println("Correct !");
				System.out.println("your try times : " + try_num);
				break;
			}
			else
			{
				System.out.print("Fail.. : ");
				System.out.println(Arrays.toString(user_arr));
			}
		}
	}
	public static void init() {
		int[] lotto_num = new int[45];
		int[] win_arr = new int[3];
		int n;
		int j;
		
		// 로또 번호 배열 만들
		for (int i = 0; i < lotto_num.length; i++)
			lotto_num[i] = i + 1;
		
		// 정답 번호 초기화
		j = 0;
		while (j < win_arr.length)
		{
			n = (int)(Math.random() * 45);
			if (lotto_num[n] == 0)
				continue;
			win_arr[j] = lotto_num[n];
			lotto_num[n] = 0;
			j ++;
		}
		select(win_arr);
		System.out.println("Answer numbers : " + Arrays.toString(win_arr));
	}

	public static void main(String[] args) {
		System.out.println("Lotto program !!");
		System.out.println();
		init();
	}

}
