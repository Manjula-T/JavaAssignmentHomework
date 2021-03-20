package week1day2homeworkAssignments;

public class ReverseEvenWord {

	public static void main(String[] args) {

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

		String test = "I am a software tester"; 
		String[] str = test.split(" ");

		for (int i = 0; i < str.length; i++) {

			if (i%2==0)
			{

				System.out.print(str[i]);

			}
			else
			{
				String reverse = str[i];
				char[] rev = reverse.toCharArray();
				for(int j=reverse.length()-1;j>=0;j--)
					System.out.print(rev[j]);
			}

		}


	}

}
