package practicePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to fatorize ");
		int a = sc.nextInt();
		
		int b = 1;
		
		for(int i = a; i>1; i--) {
			b = b * i;
		}
		
		System.out.println("The factorial of the numbers is " + b);

	}

}
