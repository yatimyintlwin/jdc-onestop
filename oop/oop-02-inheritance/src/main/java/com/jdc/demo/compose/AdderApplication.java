package com.jdc.demo.compose;

public class AdderApplication extends Calculator {
	
	public void showAddResult(int a, int b) {
		
		var result = add(a, b);
		System.out.printf("%s + %s = %s%n", a, b, result);
	}
}
