package com.jdc.demo.Override;

public class Child extends Parent {

	public void jobForChild() {
		System.out.println("Job For Child");
	}
	
	@Override
	public void doingSomething() {
		System.out.println("Doing Something from Child");
	}
}
