package com.qa.pushkal.context;

import com.qa.pushkal.strategy.Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
