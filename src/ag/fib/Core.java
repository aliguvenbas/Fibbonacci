package ag.fib;

public class Core {

	public static void main(String[] args) {
		ControlEngine controlEngine = new ControlEngine();
		int limit;

		limit = 500000;
		controlEngine.start(new Fibbonacci(1), new PrimeNumber(), limit);

//		limit = 500000;
//		controlEngine.start(new Fibbonacci(9), new PrimeNumber(), limit);

	}

}
