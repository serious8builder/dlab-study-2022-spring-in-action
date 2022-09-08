package tacos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardExpiryValidator implements ConstraintValidator<CreditCardExpiry, String> {

    @Override
    public void initialize(CreditCardExpiry expiry) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile("^(0[1-9]|1[1-2])([\\/])([1-9][0-9])$");
        Matcher matcher = pattern.matcher(value);
        try {
            if (!matcher.matches())
                return false;
            else {
                return true;
            }
        } catch (Exception e){
            return false;
        }
    }
}
