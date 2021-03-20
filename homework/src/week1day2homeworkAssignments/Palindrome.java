package week1day2homeworkAssignments;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String word1 = "madam";
		String word2 ="";

		System.out.println("Word1 is" + word1);

		for (int i=word1.length()-1;i>=0;i--)
		{
			word2 = word2+word1.charAt(i);

		}

		System.out.println("Word2 is" +word2);

		if (word2.equals(word1))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindorme");
		}
	}


}

