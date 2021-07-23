package com.wjm.domain;

public class School {
    private int id;
    private  String school_name;
    private  String people;
    private String telephone;
    private String astrict;


    public  School(){

    }

    public School(int id, String school_name, String people, String telephone, String astrict) {
        this.id = id;
        this.school_name = school_name;
        this.people = people;
        this.telephone = telephone;
        this.astrict = astrict;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAstrict() {
        return astrict;
    }

    public void setAstrict(String astrict) {
        this.astrict = astrict;
    }














    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", school_name='" + school_name + '\'' +
                ", people='" + people + '\'' +
                ", telephone='" + telephone + '\'' +
                ", astrict='" + astrict + '\'' +
                '}';
    }










}
