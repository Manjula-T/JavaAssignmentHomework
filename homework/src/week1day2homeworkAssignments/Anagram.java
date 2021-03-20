package week1day2homeworkAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1= "Manjula";
		String text2="alujnaM";

		if(text1.length()==text2.length()) 
		{
			char[] ch1=	text1.toCharArray();
			char[] ch2=	text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean	status= Arrays.equals(ch1,ch2);
			System.out.println("Both words has same value and its an anagram:" +status);	
		}
		else
		{
			System.out.println("Both words has not same value and its not an anagram:");	
		}
	}

}
