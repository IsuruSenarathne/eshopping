package com.bellacore.eshopping.config.security;

public enum ApplicationUserPermission {
    PRODUCT_READ("PRODUCT_READ"), //http://tutorials.jenkov.com/java/enums.html
    PRODUCT_WRITE("PRODUCT_WRITE"),
    USER_READ("USER_READ"),
    USER_WRITE("USER_WRITE");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission(){
        return permission;
    }
}
