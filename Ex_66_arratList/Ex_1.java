package Ex_66_arratList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(0);
		list1.add(4);

		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1);  // [5, 2, 3, 1, 0, 4]
		System.out.println(list2);  // [2, 3, 1]

		Collections.sort(list1);    // [0, 1, 2, 3, 4, 5]
		Collections.sort(list2);    // [1, 2, 3]

		System.out.println(list1.containsAll(list2));   // true

		list2.add("A");
		list2.add(2, "B");
		list2.add(2, "C");
		System.out.println(list2);  // [1, 2, C, B, 3, A]

		list1.retainAll(list2);      // list1 에서 list2 와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println(list1);  // [1, 2, 3]

		for (int i = list2.size() -1; i >= 0 ; i--){
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println(list1);  // [1, 2, 3]
		System.out.println(list2);  // [C, B, A]
	}
}
