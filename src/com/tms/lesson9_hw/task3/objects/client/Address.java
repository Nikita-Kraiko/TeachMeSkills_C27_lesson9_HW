package com.tms.lesson9_hw.task3.objects.client;

public class Address {
    protected String country;
    protected String city;
    protected String street;
    protected String numHouse;
    protected int postID;

    public Address(String country, String city, String street, String numHouse, int postID) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.numHouse = numHouse;
        this.postID = postID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(String numHouse) {
        this.numHouse = numHouse;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }
}
