package com.tdd;

 class Pair {
	private String to;
	private String from;
	
	public Pair(String from, String to) {
		this.to = to;
		this.from = from;
	}
	
	public boolean equals(Object object) {
		Pair pair= (Pair) object;
		
		return from.equals(pair.from) && to.equals(pair.to);
	}
	
	public int hashCode() {
		return 0;
	}
		
		
		
}
