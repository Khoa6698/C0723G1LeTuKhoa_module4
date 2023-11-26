package com.example.bai_tap_1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Validator {

    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private int age;
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if (!userDto.firstname.matches("^[a-zA-Z]*")){
            errors.rejectValue("firstname   ",null,"Length form 5 to 45");
        }
        if (!userDto.lastname.matches("^[a-zA-Z]*")){
            errors.rejectValue("lastname",null,"Length form 5 to 45");
        }
        if (!userDto.phone.matches("^0[3|7|8|9]\\d{8}$")){
            errors.rejectValue("phone",null,"Invalid phone number ");
        }
//        if (!userDto.age.matches("^(1[89]|[2-9][0-9])$")){
//            errors.rejectValue("age",null,"Day of birth greater than 18");
//        }
        if (!userDto.email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")){
            errors.rejectValue("email",null,"Email in wrong format(dinhnam123@gmail.com)");
        }
    }
}
