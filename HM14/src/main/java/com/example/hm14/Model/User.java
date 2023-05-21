package com.example.hm14.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

    @AllArgsConstructor
    @Data
    public class User {
        @NotNull(message = "id can't be null")
        @Size(message = "have to be 3 character long")
        private int id;


        @NotEmpty (message = "username can not be empty")
        @Size(min = 5,message = "username must to be 5 character long")
        private String username;

        @Pattern(regexp = " ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6}$")
        )
        private String password;

        @NotEmpty(message = "password can not be empty")
        @Email(message = " must be valid email")
        private String email;

        @NotEmpty(message = "Position can not be empty")
        @Pattern(regexp = "Admin|Customer", message = "Position must be Admin or Customer only")
        private String role;

        @NotNull(message = "balance can not be null")
        @Positive(message = "balance must be positive number ")
        private int balance;

    }
}
