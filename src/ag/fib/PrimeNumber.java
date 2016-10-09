package ag.fib;

public class PrimeNumber {

	int minPrimeNumber = 2;

	protected boolean isPrimeNumber(int number) {
		boolean ret = false;

		if (number < minPrimeNumber) {
			System.out.println("En k���k asal say� " + minPrimeNumber + " dir.Girdi�iniz say� " + minPrimeNumber
					+ " den k���k olamaz.");
			return false;
		}
		for (int divisor = minPrimeNumber; divisor <= number; divisor++) {

			if (number == divisor) {
				System.out.println(number + " asal say�d�r");
				return true;
			}
			if (number % divisor == 0) {
				System.out.println(number + " asal say� de�ildir");
				return false;
			}
		}
		return false;
	}
}
