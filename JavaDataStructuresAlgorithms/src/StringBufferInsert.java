public class StringBufferInsert {

	public static void main(String[] args) {
		
		//Inserting "123" at the positiion 3 of the String
		StringBuffer sb = new StringBuffer("abcdefghijk");
		sb.insert(3, "123");
		System.out.println(sb);
	}
}