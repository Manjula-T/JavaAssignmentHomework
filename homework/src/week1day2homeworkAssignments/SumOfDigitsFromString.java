package week1day2homeworkAssignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		
		String text = "Tes12Le79af65";
		int sum =0;
		char[] ch = text.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			
			System.out.println(Character.isDigit(c));
			sum=sum+(Character.getNumericValue(c));
			System.out.print(c);
		}

	}

}
