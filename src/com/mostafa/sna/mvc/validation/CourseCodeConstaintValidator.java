package com.mostafa.sna.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstaintValidator implements ConstraintValidator<CourseCode, String> {

	String[] coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {

		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		boolean result = false;

		if (code != null) {
			for (String tempPrefix : coursePrefix) {
				result = code.startsWith(tempPrefix);
				if (result) {
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}

}
