package P_27_Quadratic_Primes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import libraries.PrimeNumbers;

public class P_27_Quadratic_Primes {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream("primes.txt", false), true);
		PrimeNumbers pn = new PrimeNumbers();
		int m = 3000000;
		int n = 9000000;

		System.out.println("begin");
		System.out.println("");

		printStream = pn.calculatePrimes(m, n, printStream);

		System.out.println("");
		System.out.println("finished");

		System.setOut(printStream);
	}

}
