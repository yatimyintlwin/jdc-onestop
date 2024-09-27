package com.jdc.online.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.online.validator.domain.Student;

public class StringValidatorsTest {

	private Validator validator = Validator.getInstance();

	@ParameterizedTest
	@CsvSource({ "Aung Aung,111111,2000-01-01", "Aung Aung,111111111111,2000-01-01" })
	public void test_success(String name, String phone, Date dob) {

		var input = new Student(name, phone, dob);

		var result = validator.validate(input);

		assertFalse(result.hasErrors());
	}

	@ParameterizedTest
	@CsvSource({ " ,11111", " ,1111111111111" })
	public void test_failure(String name, String phone) {
		var input = new Student(name, phone, null);

		var result = validator.validate(input);

		assertTrue(result.hasErrors());
		
		assertEquals(3, result.getErrors().length);
	}
}
