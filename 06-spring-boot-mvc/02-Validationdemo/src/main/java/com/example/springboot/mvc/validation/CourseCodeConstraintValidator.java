package com.example.springboot.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {


    private String coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix=constraintAnnotation.value();
    }

//    @Override
//    public boolean isValid(String thecode, ConstraintValidatorContext constraintValidatorContext) {
//        boolean result = thecode.startsWith(coursePrefix);
//        return result;
//    }
@Override
public boolean isValid(String theCode, ConstraintValidatorContext context) {

    if (theCode == null) {
        return true;
    }

    return theCode.startsWith(coursePrefix);
}
}
