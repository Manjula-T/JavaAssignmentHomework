package week1day2homeworkAssignments;

public class Factorial {

	public static void main(String[] args) {

		int fact=1 ;
		int input = 5;

		for (int n = 1;  n<=input; n++) {			
			fact = fact*n; 
		}
		System.out.print("Factorial of 5 is" + fact);


	}

}


