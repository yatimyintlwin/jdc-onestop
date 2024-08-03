package com.jdc.demo.override;

import org.junit.jupiter.api.Test;

import com.jdc.demo.Override.Child;
import com.jdc.demo.Override.Parent;

public class OverrideTest {

	@Test
	void test() {

		Child child = new Child();
		use(child);
		
//		child.doingSomething();
//		child.jobForChild();
	}
	
	void use(Parent data) {
		data.doingSomething();
	}
}
