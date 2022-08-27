package com.tdd;

public class Sum implements Expression {
//	public Money augend;
//	public Money addend;
	
	public Expression augend;
	public Expression addend;
	
	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}
	
	public Money reduce(Bank bank, String to) {
		int amount = this.addend.reduce(bank, to).amount + this.augend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	public Expression plus(Expression addend) {
		return new Sum(this,addend);
	}
	
	public Expression times(int factor) {
		return new Sum(this.augend.times(factor), this.addend.times(factor));
	}
}
