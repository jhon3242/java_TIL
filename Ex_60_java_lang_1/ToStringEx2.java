package Ex_60_java_lang_1;

public class ToStringEx2 {
	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		System.out.println(str);                 // KOREA
		System.out.println(str.toString());      // KOREA
		System.out.println(today);               // Mon Apr 18 16:56:41 KST 2022
		System.out.println(today.toString());    // Mon Apr 18 16:56:41 KST 2022
	}
}
