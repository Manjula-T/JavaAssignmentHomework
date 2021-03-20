package week1day2homeworkAssignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		// integer number 
		long number = 567854l;
		
		long sum = 0;
		
		while( number>0)
		{
			sum =sum+(number%10);
			number = number/10;
		}

	System.out.println(sum);
	}
}
