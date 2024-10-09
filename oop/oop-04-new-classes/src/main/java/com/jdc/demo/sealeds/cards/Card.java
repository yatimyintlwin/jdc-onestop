package com.jdc.demo.sealeds.cards;

public sealed interface Card permits GameCard, TarrotCard{

	String name();
	int ordinal();
	int value();
}
