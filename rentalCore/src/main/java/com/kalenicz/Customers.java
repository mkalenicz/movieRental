package com.kalenicz;

import java.util.Date;

/**
 * Created by RENT on 2017-05-19.
 */
public class Customers {
    private String pesel;
    private static int nextId = 0;
    private String name;
    private String surname;
    private String city;
    private int id;
    private Date date;

    public Customers(String pesel, String name, String surname, String city) {
       id = nextId;
       nextId ++;
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
