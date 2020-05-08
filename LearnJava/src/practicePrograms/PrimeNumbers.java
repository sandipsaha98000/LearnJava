package practicePrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1 ");
		int n = sc.nextInt();
		
		boolean prime = true;
		
		for(int i = 2; i<n; i++) {
			if(n % i ==0) {
				prime = false;
				break;
			}
			
		}
		if (n<2) prime = false;
		System.out.println("Prime " + prime);
	}

}
