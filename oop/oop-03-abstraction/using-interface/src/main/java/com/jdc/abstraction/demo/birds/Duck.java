package com.jdc.abstraction.demo.birds;

import com.jdc.abstraction.demo.Birds;
import com.jdc.abstraction.demo.Flyable;
import com.jdc.abstraction.demo.Swimable;

public class Duck extends Birds implements Swimable, Flyable {

	@Override
	public void eat() {
	}

	@Override
	public void swim() {
	}

	@Override
	public void fly() {
	}

}
