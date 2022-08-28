package Ex_66_arratList.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijklABCDEFGHIJKL!@#$%^&*(";
		int     length = source.length();

		List list = new ArrayList(length/LIMIT + 10);

		for (int i = 0; i < length; i+= LIMIT) {
			if (i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		list.forEach(val -> System.out.println(val));
	}
}
