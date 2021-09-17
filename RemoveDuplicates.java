package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String replaceString;
		int count;
		text = text.toLowerCase();
		String text1[] = text.split(" ");
		System.out.println("The Duplicate words in the given string:");

		for (int i = 0; i < text1.length; i++) {
			count = 1;
			for (int j = i + 1; j < text1.length; j++) {
				if (text1[i].equals(text1[j])) {
					count++;
					text1[j] = "";
				}
			}
			if (count > 1 && text1[i] != "")
				replaceString = text1[i].replaceAll("text1[i]", "");
			System.out.print(" ");
			System.out.print(text1[i]);
		}
	}
}

/*
 * Pseudo code
 * 
 * a) Use the declared String text as input String text =
 * "We learn java basics as part of java sessions in java week1"; b) Initialize
 * an integer variable as count c) Split the String into array and iterate over
 * it d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. f) if the count > 1 then
 * replace the word as ""
 * 
 * g) Displaying the String without duplicate words
 */