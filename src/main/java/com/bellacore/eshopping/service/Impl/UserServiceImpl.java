package com.bellacore.eshopping.service.Impl;

import com.bellacore.eshopping.dto.userDto.UserCreateDto;
import com.bellacore.eshopping.entity.Role;
import com.bellacore.eshopping.entity.User;
import com.bellacore.eshopping.exception.UserNotFoundException;
import com.bellacore.eshopping.repository.RoleRepository;
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

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long userId) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findById(userId);
        if (!user.isPresent()  || user == null){
            throw new UserNotFoundException("No user found.");
        }
        return user;
    }

    @Override
    public void saveUser(UserCreateDto userCreateDto) {
        List<Role> roles = roleRepository.findAllById(userCreateDto.getRoles());
        User user = new User();
        user.setUsername(userCreateDto.getUsername());
        user.setEmail(userCreateDto.getEmail());
        user.setPassword(passwordEncoder.encode(userCreateDto.getPassword()));
        user.setRoles(roles);
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
