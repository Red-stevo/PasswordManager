package com.bughunters.code.passwordmanagerwebapplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
public class ManagingPasswords {
    private long userId;
    private String password;
    private String username;
    private String websiteName;



    // Existing constructors, getters, and setters

    public ManagingPasswords(long userId,String password, String username, String websiteName) {
        this.userId = userId;
        this.password = password;
        this.username = username;
        this.websiteName = websiteName;
    }
}
