package Ex_60_java_lang_1;

public class EqualsEx3 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));                  // ture
		System.out.println(str1.hashCode());                    // 96354
		System.out.println(str2.hashCode());                    // 96354
		System.out.println(System.identityHashCode(str1));      // 1175962212
		System.out.println(System.identityHashCode(str2));      // 918221580
	}
}
