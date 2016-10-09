package ag.fib;

import java.util.ArrayList;

public class Fibbonacci {

	private int firstNumber;
	private ArrayList<Integer> fibArray = new ArrayList<>();

	public Fibbonacci(int firstNumber) {
		startArray(firstNumber);
	}

	private void startArray(int firstNumber) {
		this.firstNumber = firstNumber;
		fibArray.clear();
		fibArray.add(0);// first number
		fibArray.add(firstNumber);// second number
	}

	//
	protected int getFibNumberManually() {
		int newFibNumber = getNextFibNumber();
		fibArray.add(newFibNumber);
		return newFibNumber;
	}


	private int getNextFibNumber() {
		int newFibNumber = -1;
		int fibNumber1, fibNumber2;
		fibNumber1 = fibArray.get(fibArray.size() - 2);
		fibNumber2 = fibArray.get(fibArray.size() - 1);
		newFibNumber = fibNumber1 + fibNumber2;
		System.out.println("f1:"+fibNumber1 + "-f2:" + fibNumber2+"-nf:"+newFibNumber);
		return newFibNumber;
	}
	
	
	protected ArrayList generateFibArrayTo(int topLimit) {
		for (int newFibNumber = firstNumber; newFibNumber < topLimit;) {
			newFibNumber = getNextFibNumber();
			fibArray.add(newFibNumber);
		}
		return fibArray;
	}
}
