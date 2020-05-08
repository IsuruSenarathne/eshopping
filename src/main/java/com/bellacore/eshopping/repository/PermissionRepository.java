package com.bellacore.eshopping.repository;

import com.bellacore.eshopping.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
