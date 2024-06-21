package com.devteria.demo_spring2.request.dto;


public class ClassRoomCreationRequest {
    private String class_name;
    private Integer number_member;

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getNumber_member() {
        return number_member;
    }

    public void setNumber_member(Integer number_member) {
        this.number_member = number_member;
    }
}
