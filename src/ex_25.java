public class ex_25{
	public static void main(String[] args) {
		int[] tmp = {1, 2, 3, 4, 5};
		System.out.println(Math1.add(2, 2));
	}
}

class Math1{
	static int add(int a, int b) {
		System.out.println("int add");
		return a + b;
	}
	static long add(long a, long b) {
		System.out.println("long add");
		return a + b;
	}
	static int add(int[] a) {
		System.out.println("array add");
		int result = 0;
		
		for (int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
}