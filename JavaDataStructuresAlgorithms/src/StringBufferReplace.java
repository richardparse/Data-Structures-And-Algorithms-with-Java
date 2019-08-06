public class StringBufferReplace {

	public static void main(String[] args) {
		
		//Replacing "ZARA" in the String position 3, 8
		StringBuffer sb = new StringBuffer ("abcdefghijk");
		sb.replace(3, 8, "ZARA");
		System.out.println(sb);
	}
}
