package kz.dar.academy.employeecoreapi.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

    private String id;
    @NotNull(message = "Name can not be empty")
    private String name;
    @NotNull(message = "Surname can not be empty")
    @Size(min = 2, max = 20, message = "Surname must be greater than 2 and less than 16")
    private String surname;
    private String company;
    private String position;
    @Email(message = "Incorrect email")
    private String email;
    private Double salary;

}
