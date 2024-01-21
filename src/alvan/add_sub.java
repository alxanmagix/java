package alvan;
import java.util.Scanner;

public class add_sub {
	public static void main(String [] args ) {
		int a,b;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the first number: ");
		a = scan.nextInt();
		System.out.println("Enter the seconf number: ");
		b = scan.nextInt();
		int result = addNum(a,b);
		System.out.println("Sum: " + result);
	}
	public static int addNum(int a,int b) {
		int sum = a+b;
		return sum;
	}
}
