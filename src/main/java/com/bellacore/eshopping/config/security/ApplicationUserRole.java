package com.bellacore.eshopping.config.security;


import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.bellacore.eshopping.config.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    USER(Sets.newHashSet(PRODUCT_READ)), // by using ApplicationUserRole.ADMIN, it will call constructor with values given inside brackets ADMIN(VALUE) see readme
    ADMIN(Sets.newHashSet(
            PRODUCT_READ,
            PRODUCT_WRITE,
            USER_READ,
            USER_WRITE)),
    MANAGER(Sets.newHashSet(USER_READ, PRODUCT_READ, PRODUCT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions(){
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissions()
                .stream().map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
