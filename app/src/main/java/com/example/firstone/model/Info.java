package com.example.firstone.model;

public class Info {
    private String name;
    private String email;
    private String pass;
    private String weight;
    private String height;

    public Info(String name, String email, String pass, String weight, String height) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
