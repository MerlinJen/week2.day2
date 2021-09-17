package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String test1[]=test.split(" ");
		for (int i = 0; i < test1.length; i++) {
			if(i%2!=0)
			{
			for (int j = test1.length - 1; j >= 0; j--)
				{if(j%2==0)
					 {
					char[] charArr=test1[j].toCharArray();
					 }
				else
						System.out.print(test1[j]);
					 
			}
			}
		}
	}

}
//Build a logic to reverse the even position words (output: I ma a erawtfos tester)



/* Pseudo Code:
 
 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/