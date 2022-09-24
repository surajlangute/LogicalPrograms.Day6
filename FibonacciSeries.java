package basic.Day6.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
    System.out.print("Enter The range of Fibonacci Series : ");
    
    int range = scan.nextInt();
    int a=1 ; int b =2;
    
    for (int i=1; i<=range; i++){
        System.out.println(a);
        int c = a+b;
        a=b;
        b=c;
	}
}
}
