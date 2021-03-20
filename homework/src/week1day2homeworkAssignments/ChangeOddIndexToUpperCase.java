package week1day2homeworkAssignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		//	 * Declare String Input

		String name = "manjula"; 

		for (int i = 0; i <name.length(); i++) {
			
			//* c)find the odd index within the loop (use mod operator)
			
			if (i%2==0)
			{
				//* d)within the loop, change the character to uppercase, 
				char ch =name.charAt(i);
				ch = Character.toUpperCase(ch);
				System.out.println(ch);
			}
			else
			{
				//if the index is odd else don't change
				System.out.println(name.charAt(i));
			}

		}


	}

}
