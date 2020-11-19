package libraries;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrimeNumbers {

	public static void main(String[] args) throws FileNotFoundException {

	}

	public PrimeNumbers() {

	}

	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns list of primes from m to n (both inclusive).
	 * 
	 * @param n
	 */
	public PrintStream calculatePrimes(int m, int n, PrintStream printStream) {
		PrimeNumbers pn = new PrimeNumbers();

		try {
			if (m < 1) {
				m = 1;
			}

			for (Integer i = m; i <= n; i++) {
				System.out.println(i);
				if (pn.isPrime(i)) {
					printStream.append(i.toString() + "\n");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return printStream;
	}

}