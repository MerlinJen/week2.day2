package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		char[] val = test.toCharArray();
		int i, length;
		System.out.println("The Reverse String is:");
		for (i = val.length - 1; i >= 0; i--) {
			System.out.print(val[i]);
		}
		System.out.println();
		length = val.length;
		System.out.println("The length of the String is " + length);
		for (int j = 0; j <= length - 1; j++) {
			System.out.println("Index [" + j + "] is " + val[j]);
		}
	}
}
