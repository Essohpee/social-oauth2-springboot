package com.essohpee.social.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "App_User",
        uniqueConstraints = { @UniqueConstraint(name = "APP_USER_UK",
                columnNames = "User_Name"), @UniqueConstraint(name = "APP_USER_UK2",
                columnNames = "Email") })

public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "User_Id",
            nullable = false)
    private Long userId;

    @Column(name = "User_Name",
            length = 36,
            nullable = false)
    private String userName;

    @Column(name = "Email",
            length = 128,
            nullable = false)
    private String email;

    @Column(name = "First_Name",
            length = 36,
            nullable = true)
    private String firstName;

    @Column(name = "Last_Name",
            length = 36,
            nullable = true)
    private String lastName;

    @Column(name = "Encryted_Password",
            length = 128,
            nullable = false)
    private String encrytedPassword;

    @Column(name = "Enabled",
            length = 1,
            nullable = false)
    private boolean enabled;

}
