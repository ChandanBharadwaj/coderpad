package interview;

public class StringRepeating {

	public static void main(String[] args) {
		String str = "ABABCABABCD";
		char[] a =str.toCharArray();
		
		char charTobeReplaced =str.charAt(0);
		String str1 = str.substring(1).replaceAll(String.valueOf(charTobeReplaced), "*");
		System.out.println(charTobeReplaced+str1);
		
	}
}
