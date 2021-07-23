package com.wjm.domain;

public class Class {

    private int id;
    private String name;
    private String classfication;
    private String price;

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classfication='" + classfication + '\'' +
                ", price='" + price + '\'' +
                ", teacher='" + teacher + '\'' +
                ", text='" + text + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    private String teacher;

    private String text;
    private String time;




    public Class(int id, String name, String classfication, String price, String teacher, String text, String time) {
        this.id = id;
        this.name = name;
        this.classfication = classfication;
        this.price = price;
        this.teacher = teacher;
        this.text = text;
        this.time = time;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassfication() {
        return classfication;
    }

    public void setClassfication(String classfication) {
        this.classfication = classfication;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }














}
