package org.example;

public class Address {

    private  String city;
    private Integer Zip;

    public Address() {
    }

    public Address(String city, Integer zip) {
        this.city = city;
        Zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer zip) {
        Zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", Zip=" + Zip +
                '}';
    }
}
