package com.example.cz2006trial;

import java.util.Date;

public class UserProfileEntity {

    private String username;
    private String email;
    private String gender;
    private Date DOB;
    private double height;
    private double weight;
    private double BMI;

    public UserProfileEntity() {

    }

    public UserProfileEntity(String username, String email, String gender, Date DOB, double height, double weight, double BMI) {
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
    }

    public UserProfileEntity(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}
