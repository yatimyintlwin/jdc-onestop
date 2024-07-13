package com.jdc.bot.model;

import java.util.Arrays;

public class Dictionary {

	public String[] array = {};

	public void register(String question, String answer) {
		var index = question.hashCode();

		if (array.length < index) {
			array = Arrays.copyOf(array, index + 1);
		}

		array[index] = answer;
	}

	public String search(String question) {

		var index = question.hashCode();

		if (array.length > index) {
			return array[index];
		}

		return null;
	}
}
