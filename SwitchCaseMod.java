import java.util.Scanner;


public class SwitchCaseMod {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();


			
			if (b>0 && b<10) {
				System.out.println("Modulus is");	
				int M = a%b;
				System.out.println(M);
				
				switch (M) {
				case 0:
					System.out.println("Modulus is Zero");
					break;
				case 1:
					System.out.println("Modulus is ONE");
					break;
				case 2:
					System.out.println("Modulus is TWO");
					break;	
				case 3:
					System.out.println("Modulus is THREE");
					break;
				case 4:
					System.out.println("Modulus is FOUR");
					break;
				case 5:
					System.out.println("Modulus is FIVE");
					break;
				case 6:
					System.out.println("Modulus is SIX");
					break;
				case 7:
					System.out.println("Modulus is SEVEN");
					break;
				case 8:
					System.out.println("Modulus is EIGHT");
					break;
				case 9:
					System.out.println("Modulus is NINE");
					break;
				case 10:
					System.out.println("Modulus is Ten");
					break;
				default:
			System.out.println("Modulus cannot be found,");

				}
		
		}else {
			System.out.println("Wrong Value");
		}
			
	
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

	}

}
