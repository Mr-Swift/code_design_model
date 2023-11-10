package org.example.entity;

import lombok.Builder;

@Builder
public class Man {
    private String id;
    private String name;
    private String age;

    private String fatherName;
    private String fGrandFatherName;
    private String fGrandMotherName;

    private String motherName;
    private String mGrandFatherName;
    private String mGrandMotherName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getfGrandFatherName() {
        return fGrandFatherName;
    }

    public void setfGrandFatherName(String fGrandFatherName) {
        this.fGrandFatherName = fGrandFatherName;
    }

    public String getfGrandMotherName() {
        return fGrandMotherName;
    }

    public void setfGrandMotherName(String fGrandMotherName) {
        this.fGrandMotherName = fGrandMotherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getmGrandFatherName() {
        return mGrandFatherName;
    }

    public void setmGrandFatherName(String mGrandFatherName) {
        this.mGrandFatherName = mGrandFatherName;
    }

    public String getmGrandMotherName() {
        return mGrandMotherName;
    }

    public void setmGrandMotherName(String mGrandMotherName) {
        this.mGrandMotherName = mGrandMotherName;
    }
}
