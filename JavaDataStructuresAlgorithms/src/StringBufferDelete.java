public class StringBufferDelete {

	public static void main(String[] args) {

		// Deletion in the postion 3 and 7 using delete() StringBuffer method
		StringBuffer sb = new StringBuffer("abcdefghijk");
		sb.delete(3, 7);
		System.out.println(sb);

	}
}
