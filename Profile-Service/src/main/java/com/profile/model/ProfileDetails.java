package com.profile.model;

public class ProfileDetails {

    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private String address;

    private Kundali kundali;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Kundali getKundali() {
        return kundali;
    }

    public void setKundali(Kundali kundali) {
        this.kundali = kundali;
    }

    @Override
    public String toString() {
        return "ProfileDetails{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", mobileNumber='" + mobileNumber + '\'' + ", address='" + address + '\'' + ", kundali=" + kundali + '}';
    }
}
