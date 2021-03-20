package week1day2homeworkAssignments;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 2345;
		
		int c=0,a;
		
	      while (n>0) {
	    	  
			
			a = n%10; 
			
			n=n/10; 
			
			c = c+(a*a*a);
	      }
	      
	      if (n==c) {
	    	  
	      System.out.println("The given number is Armstrong" );

	}
	       
	      else
	      {
	    	  System.out.println("The given number is not an  Armstrong");  
	      }

	}
}

