package com.application.models;

public class UserFunctions {
    private String name;
    private String phoneNumber;
    private String position;


    private Integer id;

    public UserFunctions(String name,String position,String phoneNumber) {

        this.position = position;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


     @Override
    public String toString() {
          return "User :" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", phoneNumber='" + phoneNumber + '\'' +
                   ", position='" + position + '\'' ;
    }
}

