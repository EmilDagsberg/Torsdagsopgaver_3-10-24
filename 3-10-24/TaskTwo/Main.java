import java.util.Scanner;
// 2.a
class Main {

	public static void main(String[] args){
		// 2.b
		System.out.println("Please type your name");

		// 2.c
		Scanner scan = new Scanner(System.in);

		// 2.d
		String input = scan.nextLine();

		// 2.e
		System.out.println("Hello " + input);
		System.out.println("Please type your age");

		// 2.f
		int age = scan.nextInt();

		// 2.g
		System.out.println("You are " + age + " years old");

		// 2.h
		int ageUntilRetirement = 67 - age;
		System.out.println("You have " + ageUntilRetirement + " years until retirement");
	}
}