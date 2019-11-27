package com.example.recyclerview2;

import android.media.Image;

public class Students {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    private String address;
    private String gender;
    private int age;

    public Students(String name, String address, String gender, int age, int imageid) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.imageid = imageid;
    }

    private int imageid;
}
