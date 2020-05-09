package com.bellacore.eshopping.service;

import com.bellacore.eshopping.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAllUsers();

    public Optional<User> getUser(Long userId);

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(Long userId);
}
