package conditionalStatemants;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int num1 = 45;
		int num2 = 75;
		int num3 = 66;
		
		if(num1< num2) {
			if(num2<num3) {
				System.out.println(num3 + " is greatest");
			}
			
			else {
				System.out.println(num2 + " is greatest");
			}
		}
		
		else {
			System.out.println(num1 + " is greatest");
		}

	}

}
