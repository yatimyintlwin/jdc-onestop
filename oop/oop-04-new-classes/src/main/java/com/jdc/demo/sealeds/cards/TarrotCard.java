package com.jdc.demo.sealeds.cards;

public enum TarrotCard implements Card {

	TarrotA(1), TarrotB(2);

	private int value;

	private TarrotCard(int value) {
		this.value = value;
	}

	@Override
	public int value() {
		return this.value;
	}

}
