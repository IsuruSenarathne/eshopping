package com.bellacore.eshopping.dto.userDto;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

public class UserCreateDto implements Serializable {
    @NotEmpty(message = "need username")
    private String username;

    @NotEmpty(message = "need email")
    private String email;

    @NotEmpty(message = "need password")
    private String password;

    @NotEmpty(message = "need roles")
    private List<Long> roles;

    public UserCreateDto(String username, String email, String password, List<Long> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserCreateDto{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
