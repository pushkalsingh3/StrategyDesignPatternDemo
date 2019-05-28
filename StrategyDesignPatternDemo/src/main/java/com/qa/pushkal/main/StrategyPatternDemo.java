package com.qa.pushkal.main;

import com.qa.pushkal.context.Context;
import com.qa.pushkal.strategyImpl.Addition;
import com.qa.pushkal.strategyImpl.Multiplication;
import com.qa.pushkal.strategyImpl.Substraction;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new Addition());
		System.out.println("Addition of 21 and 20 -> "+context.executeStrategy(21, 20));
		context = new Context(new Substraction());
		System.out.println("Substraction of 21 and 20 -> "+context.executeStrategy(21, 20));
		context = new Context(new Multiplication());
		System.out.println("Multiplication of 21 and 20 -> "+context.executeStrategy(21, 20));
	}
}
