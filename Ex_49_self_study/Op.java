package Ex_49_self_study;

import java.util.Scanner;
import java.util.Vector;

interface Opimp{
	int make_num();
	Vector make_arr(int size);
	void vectorToString(Vector arr);
}

class Self_op extends Op{
	Scanner scanner = new Scanner(System.in);
	public int make_num(){
		return scanner.nextInt();
	}
}

public class Op implements Opimp{
	public int make_num(){
		return (int)(Math.random()*45) + 1;
	};
	public Vector make_arr(int size){
		Vector arr = new Vector();
		while (arr.size() < size)
			arr.add(make_num());
		return (arr);
	}
	public void vectorToString(Vector arr){
		for (int i = 0; i <arr.size(); i++)
			System.out.printf("%d ", arr.get(i));
		System.out.println();
	}
}
