package com.example.user.userlogin;

/**
 * Created by USER on 11/7/2017.
 */

public class User {

    private String username, email, gender;

    public User(int id, String username, String email, String gender) {
        this.username = username;
        this.email = email;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}
