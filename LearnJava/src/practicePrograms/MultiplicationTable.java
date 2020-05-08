package practicePrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of which you want to see the table ");
		int a = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(a * i);
		}

	}

}
