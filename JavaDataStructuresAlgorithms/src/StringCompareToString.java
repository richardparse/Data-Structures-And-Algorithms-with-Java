
public class StringCompareToString {

	public static void main(String[] args) {
		
		//str2 is the string to be compared
		
		// The value 0 is returned if the argument is a string lexicographically equal to this string;
		// a value less than 0 if the argument is a string lexicographically greater than this string
		// and a value freater than 0 if the argument is a string lexicographically less than this string.
		
		String str1 = "Strings are immutable";
		String str2 = "Strings are immutable";
		String str3 = "Integers are not immutable";

		int result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);
		
		result = str3.compareTo( str1 );
		System.out.println(result);

	}
}