package com.bellacore.eshopping.dto.userDto;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class UserAuthDto implements Serializable {
    @NotEmpty(message = "need username")
    private String username;

    @NotEmpty(message = "need password")
    private String password;

    public void UserCreateDto(String username, String password ) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
