package basic.LogicalPrograms.day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++){
            if (n%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(n + " is a Prime Number");
        }else {
            System.out.println(n + " is Not a Prime Number");
		}

	}
}