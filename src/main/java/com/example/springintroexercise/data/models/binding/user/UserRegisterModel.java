package com.example.springintroexercise.data.models.binding.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterModel
{
    private String username;
    private String password;
    private String confirmPassword;
}
