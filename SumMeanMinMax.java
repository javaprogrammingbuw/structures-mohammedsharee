import java.util.Scanner;


public class SumMeanMinMax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = scan.nextInt();
		System.out.println("Enter the value of B");
		int b = scan.nextInt();
		
		
		System.out.println("Enter the value of c");
		int c = scan.nextInt();
		
		double sum = a+b+c ;
		System.out.println("Sum is " + sum);
		
		double mean = sum/3 ;
		System.out.println("mean is " + mean);
		
		if (a<b && a<c) {
			System.out.println("A is smaller than all");
		}else if (b<a && b<c) {
			System.out.println("b is smaller than all");
		
	   }else {
		    System.out.println("C is smaller than all");
	   }
		
		if (a>b && a>c) {
			
			System.out.println("A is greater than all");
		}else if (b>a && b>c) {
			
			System.out.println("b is greater than all");
		
	   }else {
		   
		    System.out.println("C is greater than all");
	   }

	}
}
