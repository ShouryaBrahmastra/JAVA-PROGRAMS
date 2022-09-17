import java.util.Scanner;

class Main {

	public static void methA(double first, double second) {
		IntfA c1 = new Calculator();

		System.out.println(c1.add(first, second));
		System.out.println(c1.sub(first, second));
	}

	public static void methS(double first, double second) {
		IntfS c2 = new ScientificCalculator();

		System.out.println(c2.add(first, second));
		System.out.println(c2.sub(first, second));
		System.out.println(c2.exp(first, second));
	}

	public static void methR(double first, double second) {
		IntfR c3 = new ScientificCalculator();

		System.out.println(c3.add(first, second));
		System.out.println(c3.sub(first, second));
		System.out.println(c3.mul(first, second));
		System.out.println(c3.div(first, second));
		System.out.println(c3.mod(first, second));
		System.out.println(c3.exp(first, second));
		System.out.println(((ScientificCalculator) c3).log(first));
	}

	public static void main(String[] args) {

		System.out.println("\n Please enter your first number:\n");

		try (Scanner a = new Scanner(System.in)) {
			double first = a.nextInt();

			System.out.println("\n Please enter your second number:\n");

			try (Scanner b = new Scanner(System.in)) {
				double second = b.nextInt();

				System.out.println("\n Please enter your name:\n");
				try (Scanner sc = new Scanner(System.in)) {
					String name = sc.next();

					char first_Char = name.charAt(0);

					System.out.println("\n The performed operation are :  \n");

					if (first_Char == 'A' || first_Char == 'a') {
						methA(first, second);
					} else if (first_Char == 'S' || first_Char == 's') {
						methS(first, second);
					} else {
						methR(first, second);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
