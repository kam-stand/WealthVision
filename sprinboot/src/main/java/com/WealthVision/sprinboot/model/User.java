package com.WealthVision.sprinboot.model;


public class User {

    private long id;
    private String name;
    private String email;

    private String twitter;
    private String facebook;
    private String linkedin;
    private String instagram;

    private String phoneNumber;

    

    public User(String name, String email, String twitter, String facebook, String linkedin, String instagram,
            String phoneNumber) {
        this.name = name;
        this.email = email;
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.instagram = instagram;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    
}