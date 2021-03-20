package week1day2homeworkAssignments;

public class RemoveDuplicates {

	public static void main(String[] args) {

		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words	
		 */

		String text = "We learn java basics as part of java sessions in java week1";

		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count =0;
			for (int j = 0; j < words.length; j++) {

				if (words[i].equalsIgnoreCase(words[j]))
				{
					count=count+1;	
				}
			}
			if (count>1)
			{
				text = text.replaceAll(words[i], "");
			}
		}

		System.out.println(text);
	}

}
