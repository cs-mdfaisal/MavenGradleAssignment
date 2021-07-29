package com.phoenix.services;

import com.phoenix.math.Calculator;

public class CalculatorServices {

	
	
	private Calculator calculator;
	
	
	
	public CalculatorServices() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CalculatorServices(Calculator calculator) {
		super();
		this.calculator = calculator;
	}



public int addition(int x,int y) {
		return calculator.add(x,y);
	}
	
}
