package org.example;

public class LogIn {

    private String name;
    private String surename;
    private String personID;

    public LogIn(){
    }

    public LogIn(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }
    public LogIn(String name, String surename, String personID){
        this.name = name;
        this.surename = surename;
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
}
