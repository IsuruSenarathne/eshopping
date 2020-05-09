package com.bellacore.eshopping.service.Impl;

import com.bellacore.eshopping.entity.User;
import com.bellacore.eshopping.repository.UserRepository;
import com.bellacore.eshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long userId) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findById(userId);
        if (user == null){
            throw new UsernameNotFoundException("No user found.");
        }
        return user;
    }

    @Override
    public void saveUser(User user) {

        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
