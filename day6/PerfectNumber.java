package basic.LogicalPrograms.day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			
			if (n % i == 0) 
				sum = sum + i;

			}
			if (sum == n) {
				System.out.println(n + " is Perfect Number");
			} else {
				System.out.println(n + " is Not Perfect Number");
			}
		}
	}
