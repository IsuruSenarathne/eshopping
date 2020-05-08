package com.bellacore.eshopping.repository;

import com.bellacore.eshopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
