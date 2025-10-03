package org.example.model;

public class User {
    private String uuid;
    private String fullName;
    private String username;
    private String email;
    private int age;
    private Gender gender;
    private Location location;

    public User(String uuid, String fullName, String username, String email, int age, Gender gender, Location location) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Location getLocation() {
        return location;
    }
}
