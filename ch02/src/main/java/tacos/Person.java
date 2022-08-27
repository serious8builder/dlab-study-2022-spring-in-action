package tacos;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Person {
    @NotNull
    @Size(min=2, max=30)
    private String name;
    @NotNull
    @Min(18)
    private Integer age;
}
