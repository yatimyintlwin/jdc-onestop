package com.jdc.online.validator.provider;

import java.lang.reflect.Field;

import com.jdc.online.validator.FieldError;
import com.jdc.online.validator.annotations.NotBlank;

public class FieldValidatorForNotBlank extends AbstractFieldValidator{

	@Override
	public FieldError validate(Field field, Object object) {

		try {
			
			var annotation = field.getDeclaredAnnotation(NotBlank.class);
			
			if(null != annotation && isStringType(field)) {
				
				field.setAccessible(true);
				var value = field.get(object);
				
				if(null == value || isViolate(value, annotation)) {
					return new FieldError(field.getName(), annotation.message());
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private boolean isViolate(Object value, NotBlank annotation) {
		
		return value.toString().isBlank();
	}

}
