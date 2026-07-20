package com.example.springboot.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD}) //can apply it on methods or fields
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define default course code
    public String value() default "LUV";
    //define error messege
    public String message() default " Course Code must start with LUV";
    public  Class<?>[] groups() default {};
    public  Class<? extends Payload>[] payload() default {};
}
