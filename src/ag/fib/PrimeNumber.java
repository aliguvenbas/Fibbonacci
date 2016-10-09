package ag.fib;

public class PrimeNumber {

	int minPrimeNumber = 2;

	protected boolean isPrimeNumber(int number) {
		boolean ret = false;

		if (number < minPrimeNumber) {
			System.out.println("En küçük asal sayý " + minPrimeNumber + " dir.Girdiðiniz sayý " + minPrimeNumber
					+ " den küçük olamaz.");
			return false;
		}
		for (int divisor = minPrimeNumber; divisor <= number; divisor++) {

			if (number == divisor) {
				System.out.println(number + " asal sayýdýr");
				return true;
			}
			if (number % divisor == 0) {
				System.out.println(number + " asal sayý deðildir");
				return false;
			}
		}
		return false;
	}
}
