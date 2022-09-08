package tacos;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import tacos.validator.CreditCardExpiry;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order {

    public List<Taco> tacos = new ArrayList<>();

    private Long id;
    private Date createdAt;

    @NotBlank(message="Name is required")
    private String deliveryName;
    @NotBlank(message="Street is required")
    private String deliveryStreet;
    @NotBlank(message="City is required")
    private String deliveryCity;
    @NotBlank(message="State is required")
    private String deliveryState;
    @NotBlank(message="Zip code is required")
    private String deliveryZip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @CreditCardExpiry(message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }
}
