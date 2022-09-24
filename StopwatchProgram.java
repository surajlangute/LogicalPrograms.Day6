package basic.Day6.LogicalPrograms;

import java.util.Scanner;

public class StopwatchProgram {

	public static void main(String[] args) {
		long endTime = 0, elapsedTime = 0, startTime = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 to start stop watch : ");
		int input1 = scan.nextInt();
		
		if (input1 == 1)
			startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		System.out.println("Enter 0 to stop the watch : ");
		int input2 = scan.nextInt();
		if (input2 == 0)
			endTime = System.currentTimeMillis();
		System.out.println(endTime);
		
		System.out.println("Elapsed time between the start and end click is : ");
		elapsedTime = (endTime - startTime) / 1000;
		
		System.out.println(elapsedTime + "seconds ");
	}

}
