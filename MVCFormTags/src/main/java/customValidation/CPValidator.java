package customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPValidator implements 
ConstraintValidator<PostalCode, String>{

	
	private String postalCodePreffix;
	
	@Override
    public void initialize(PostalCode postalCode) {
		
		postalCodePreffix = postalCode.value();
    }
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		boolean isValid=false;
		
		if(arg0!=null && arg0.isEmpty()==false) {
			isValid = arg0.startsWith(postalCodePreffix);
		}
		
		
		return isValid;
	}

}
