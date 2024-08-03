package com.jdc.demo.hiding;

public class ChildType extends SuperType {

	public void showFormChild() {
		System.out.printf("Instance Variable : %s.%n", instanceVariable);
		
		System.out.printf("Static Variable : %s.%n", staticVariable);
		
		doStaticMathod();
	}
}
