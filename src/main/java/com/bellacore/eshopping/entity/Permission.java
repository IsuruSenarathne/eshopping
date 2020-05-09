package com.bellacore.eshopping.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "permissions", fetch = FetchType.EAGER)
    private Collection<Role> roles;
}