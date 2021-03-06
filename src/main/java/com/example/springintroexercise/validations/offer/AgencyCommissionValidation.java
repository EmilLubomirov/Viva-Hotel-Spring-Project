package com.example.springintroexercise.validations.offer;

import com.example.springintroexercise.validations.offer.impl.AgencyCommissionValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgencyCommissionValidator.class)
public @interface AgencyCommissionValidation
{
    String message() default "Apartment commission must be greater than or equal to 0!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
