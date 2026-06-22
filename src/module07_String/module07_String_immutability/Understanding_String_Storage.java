package module07_String.module07_String_immutability;

public class Understanding_String_Storage {

	public static void main(String[] args) {
		String str = "abc";
		String str1 = "abc";
		String str3 = "abc";

		String str2 = "abc";

		str1 = str1 + "def";
		System.out.println(str);
		System.out.println(str1);

		System.out.println(str1 == str2);
		System.out.println(str1 == str);

	}

}
