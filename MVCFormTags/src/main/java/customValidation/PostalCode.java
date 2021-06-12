package customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPValidator.class)//This tell what class contains the logic of the validation.
@Target({ElementType.FIELD, ElementType.METHOD})//Target of the validation.
@Retention(RetentionPolicy.RUNTIME)//This annotation specifies when will it be checked.
public @interface PostalCode {

	
	//Default postal code definition
	public String value() default "28";
	//Error message
	public String message() default "Postal code must start with 28";
	//groups
	Class<?>[] groups() default {};
	//Payloads.
    Class<? extends Payload>[] payload() default {};	
	
}
