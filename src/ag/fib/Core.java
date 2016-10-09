package ag.fib;

public class Core {

	public static void main(String[] args) {
		ControlEngine controlEngine = new ControlEngine();
		int limit;

//		limit = 500000;
//		controlEngine.control1(new Fibbonacci(1), new PrimeNumber(), limit);//a

		limit = 500000;
		controlEngine.control1(new Fibbonacci(9), new PrimeNumber(), limit);//b

	}

}
