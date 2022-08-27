package com.tdd;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Bank {
	private Map<Pair, Integer> rates = new HashMap<>();
	public Money reduce(Expression source, String to) {
//		if(source instanceof Money)
//		{
//			return (Money)source;
//		}
		//return Money.dollar(10);
		//Sum sum = (Sum) source;
//		int amount = sum.addend.amount + sum.augend.amount;
//		return new Money(amount, to);
		
		//return sum.reduce(to);
		return source.reduce(this, to);
	}
	
	public int rate(String from, String to) {
		//return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
		if(from.equals(to))
		{
			return 1;
		}
		return rates.get(new Pair(from, to));
	}
	
	public void addRate(String from, String to, int rate ) {
		rates.put(new Pair(from, to), rate);
	}
}
