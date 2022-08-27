package com.tdd;

class Money implements Expression {
	protected int amount;
	protected String currency;
	
	protected Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	@Override
	public boolean equals(Object thatObject) {
		if(!(thatObject instanceof Money))
		{
			return false;
		}
		
		Money money = (Money) thatObject;
		return this.amount == money.amount && this.currency().equals(money.currency());
			
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	//public Money times(int multiplier) {
	public Expression times(int multiplier) {
		//return null;
		return new Money(amount * multiplier, this.currency);
	}
	
	protected String currency() {
		return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
//	public Money plus(Money other) {
//		return new Money(other.amount + this.amount, this.currency());
//	}
	
//	public Expression plus(Money added) {
//		return new Money(added.amount + this.amount, this.currency());
//	}
	
//	public Expression plus(Money added) {
//		return new Sum(this, added);
//	}
	
	@Override
	public Expression plus(Expression added) {
		return new Sum(this, added);
	}
	
	
	public Money reduce(Bank bank , String to) {
		//return this;
		//int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
		int rate = bank.rate(currency, to);
		return new Money(amount/rate, to);
	}
	
//	@Override
//	public Expression times(int factor) {
//		return new Money(this.amount * factor, this.currency());
//	}
	
	
}
