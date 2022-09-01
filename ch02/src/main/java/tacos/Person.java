package tacos;

import lombok.Data;
import tacos.validator.ContactNumberConstraint;
import tacos.validator.CreditCardExpiry;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Person {
    @NotNull
    @Size(min=2, max=30)
    private String name;
    @NotNull
    @Min(value = 18, message = "You are too young")
    private Integer age;
    @ContactNumberConstraint
    private String phone;
}
