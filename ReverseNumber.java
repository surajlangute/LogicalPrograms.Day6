package basic.Day6.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = scan.nextInt();
        
        while (n>0){
          int r = n%10;
            System.out.print(r);
            n=n/10;
        	}
	}
}
