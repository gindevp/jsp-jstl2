package com.example.jspjstl2;

import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate dateBith;
    private String address;
    private String url;

    public Animal() {
    }

    public Animal(String name,String dateBith, String address, String url) {
        this.name = name;
        this.dateBith = LocalDate.parse(dateBith);
        this.address = address;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBith() {
        return dateBith;
    }

    public void setDateBith(String dateBith) {
        this.dateBith = LocalDate.parse(dateBith);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
