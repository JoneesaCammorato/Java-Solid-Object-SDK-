/**
 * 22 April 2022
 * Purpose: main file that runs test and outputs object data to console
 *
 */


public class Main  {






	public static void main(String[] args) {
		// prints name of program to console
		System.out.println();
		System.out.println();
		System.out.println("Solid Object SDK Test Program:");
		System.out.println();
		System.out.println();
		// tests block 1 and prints to console
		System.out.println("1.\t Block Constructor test:");

		System.out.println("Testing:" );

		Block b1= new Block();

		System.out.println(b1);

		System.out.println();

		// tests copy of block 1 and prints to console
		System.out.println("2.\t Block Copy Constructor test:");

		Block b2 = new Block(b1);

		System.out.println(b2);

		// compares block 1 and block 2 and when equal prints to console
		System.out.println("3.\t Block Comparison test:");

		System.out.printf("Testing:", b1, b2);

		if(b1==b2) {
			System.out.println("Result:\t The objects are equal.");
		}

		// tests block 2 and prints to console
		System.out.println(" 4. \t Block No-Arg Constructor Test:" );

		b2 = new Block();

		System.out.println(b2);

		System.out.println("5.\t Block Comparison test:");

		System.out.printf("Testing:", b1, b2);

		if(b1!=b2) {
			System.out.println("Result:\t The objects are not equal.");
		}

		System.out.println("6.\t Sphere Constructor test:");

		System.out.println("Testing:" );

		Sphere s1= new Sphere();

		System.out.println(s1);

		System.out.println();

		// tests copy of block 1 and prints to console
		System.out.println("7.\t Sphere Copy Constructor test:");

		Sphere s2 = new Sphere(s1);

		System.out.println(s2);

		// compares block 1 and block 2 and when equal prints to console
		System.out.println("8.\t Sphere Comparison test:");

		System.out.printf("Testing:", s1, s2);

		if(s1==s2) {
			System.out.println("Result:\t The objects are equal.");
		}

		// tests block 2 and prints to console
		System.out.println(" 9. \t Sphere No-Arg Constructor Test:" );

		s2 = new Sphere();

		System.out.println(s2);

		System.out.println("10.\t Sphere Comparison test:");

		System.out.printf("Testing:", s1, s2);

		if(s1!=s2) {
			System.out.println("Result:\t The objects are not equal.");
		}
		// tests block and sphere and prints to console
		System.out.println(" 9. \t Sphere No-Arg Constructor Test:" );


		System.out.println(b2);

		System.out.println(s2);

		System.out.println("10.\t Block-Sphere Comparison test:");

		System.out.printf("Testing:", b2, s2);





		System.out.println("Result:\t The objects are not equal.");








	}	

}
