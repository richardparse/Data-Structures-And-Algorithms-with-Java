public class StringCompareToObject {

	public static void main(String[] args) {

		// Compares a String to another Object

		String str1 = "Strings are immutable";
		String str2 = new String("String are immutable");
		String str3 = new String("Integers are not immutable");

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);
	}
}