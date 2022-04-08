package playground;

import java.util.Arrays;
import java.util.Scanner;

// 클래스를 사용하여 기존에 로또 프로그램을 개선해보았다.
public class play_lotto2 {
	
	public static void select(){
		System.out.println("random : 0 ");
		System.out.println("select yourself : 1 ");
		System.out.println("Chose your choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int[] user_arr;
		Lotto2 lot = new Lotto2();
		
		while (true)
		{
			if (choice == 0)
				user_arr = Lotto2.make_num();
			else
			{
				System.out.println("Sorry I didn't make it yet");
//				user_arr = scanner.nextLine();
				return ;
			}
			if (lot.match(Lotto2.lotto_num, user_arr))
			{
				System.out.println("Correct !" );
				System.out.println("answer : " + Arrays.toString(user_arr));
				System.out.println("your try times : " + lot.count);
				break;
			}
			else
			{
				System.out.print("Fail.. : ");
				System.out.println(Arrays.toString(user_arr));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Lotto2 program !!");
		System.out.println();
		select();
	}

}
class Lotto2{
	int count;  // 시도 횟수.
	static int[] lotto_num = make_num();
	
	static int[] whole_num_arr(){
		int[] num_arr = new int[46];
		
		for (int i = 0; i < num_arr.length; i++)
			num_arr[i] = 0;
		return (num_arr);
	}
	
	static int[] make_num() { // 난수 숫자 배열 만드는 메서
		int size = 3;  // 배열 크기.
		int j = 0;
		int n; 
		int[] num_arr = whole_num_arr(); // 0~45 숫자배열.
		int[] array = new int[3]; // 리턴할 배열.
		
		while (j < size){
			
			n = (int)(Math.random() * 45) + 1;
			if (num_arr[n] != 0)
				continue;
			num_arr[n] += 1;
			array[j++] = n;	
		}
		return (array);
	}
	
	boolean match(int[] dest, int[] src) {
		count += 1;
		int[] num_arr = whole_num_arr();
		for (int i = 0; i<dest.length; i++) {
			num_arr[dest[i]] += 1;
		}
		for (int i = 0; i<src.length; i++) {
			if (num_arr[src[i]] < 1)
				return (false);
		}
		return (true);
	}
}
