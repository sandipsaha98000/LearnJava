package practicePrograms;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1 ");
		int a = sc.nextInt();
		System.out.println("Enter the number 2 ");
		int b = sc.nextInt();
		int ans = 1;
		
		for(int i = 0; i<b; i++) {
			ans *= a;
		}
		
		System.out.println(ans);
		
		

	}

}
