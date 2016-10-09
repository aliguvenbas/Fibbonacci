package ag.fib;

public class ControlEngine {

	private boolean noBiggestPrimeNumber, noSmallestPrimeNumber;

	public void start(Fibbonacci fibbonacci, PrimeNumber primeNumber, int limit) {
		int biggestPrimeNumberLessThanLimit = -1, smallestPrimeNumberBiggerThanLimit = -1;

		while (true) {
			int fibNumber = fibbonacci.getFibNumberManually();
			if (fibNumber < 0) {// if < 0 in here, means can not calculated
				noSmallestPrimeNumber = true;
				break;
			}
			if (primeNumber.isPrimeNumber(fibNumber)) {
				if (fibNumber < limit) {
					biggestPrimeNumberLessThanLimit = fibNumber;
				} else {
					if (biggestPrimeNumberLessThanLimit == -1) {
						noBiggestPrimeNumber = true;
					}
					smallestPrimeNumberBiggerThanLimit = fibNumber;
					break;
				}
			}
		}
		if (noBiggestPrimeNumber) {
			System.out.println(limit + " den k���k en b�y�k asal say� yoktur");
		} else {
			System.out.println(limit + " den k���k en b�y�k asal say�:" + biggestPrimeNumberLessThanLimit);
		}

		if (noSmallestPrimeNumber) {
			System.out.println(limit + " den b�y�k en k���k asal say� hesaplanamad�");
		} else {
			System.out.println(limit + " den b�y�k en k���k asal say�:" + smallestPrimeNumberBiggerThanLimit);
		}

	}
}
