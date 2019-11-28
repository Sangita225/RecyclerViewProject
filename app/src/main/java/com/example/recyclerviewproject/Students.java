package com.example.recyclerviewproject;

public class Students {

    public Students(String name, String address, int age, String gender,int imgId,int imgdustbinId) {
        Name = name;
        Address = address;
        this.age = age;
        this.gender = gender;
        this.imgId=imgId;
        this.imgdustbinId=imgdustbinId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getImgdustbinId() {
        return imgdustbinId;
    }

    public void setImgdustbinId(int imgdustbinId) {
        this.imgdustbinId = imgdustbinId;
    }

    private String Name;
private String Address;
private int age;
private String gender;

    private int imgId;
private int imgdustbinId;






}
