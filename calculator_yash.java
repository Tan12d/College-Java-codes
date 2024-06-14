
import java.util.*;

class calculator_yash {
	private static Scanner sc = new Scanner(System.in);
	private static int[] inputs = new int[2];

	public static void main(String[] args) {

		int option;
		int result;

		loop: while (true) {
			System.out.println("Choose option:");
			System.out.println("1.Addition");
			System.out.println("2.Substaction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");

			System.out.println("\nEnter option");
			option = sc.nextInt();

			switch (option) {
			case 1: {
//				System.out.println("Enter first number:");
//				int fno = sc.nextInt();
//				System.out.println("Enter Second number:");
//				int secno = sc.nextInt();

				// To use less memory we have created one other class
				inputs = readInputs();
				result = Addition.add(inputs[0], inputs[1]);
				System.out.println("Result=" + result);

				break;
			}
			case 2: {
				inputs = readInputs();
				System.out.println("Result=" + Substraction.subs(inputs[0], inputs[1]));
				break;
			}
			case 3: {
				inputs = readInputs();
				System.out.println("Result=" + Multiplication.mul(inputs[0], inputs[1]));
				break;
			}
			case 4: {
				System.out.println("Result=" + Division.div(inputs[0], inputs[1]));
				break;
			}
			case 5: {
				System.out.println("Thank You! VISIT AGAIN");
				break loop;
			}
			default:
				System.out.println("Invalid option");
			}// switch closed

		} // while loop closed
	}

	private static int[] readInputs() {

		System.out.println("Enter fno.");
		inputs[0] = sc.nextInt();

		System.out.println("Enter sec no.");
		inputs[1] = sc.nextInt();

		return inputs;

	}

}