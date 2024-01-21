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
		
		int result = add(a,b);
		System.out.println("Sum: " + result);
	}
	public static int add(int a,int b) {
		int sum = a+b;
		return sum;
	}
}
