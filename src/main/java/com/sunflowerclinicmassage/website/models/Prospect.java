package com.sunflowerclinicmassage.website.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Prospect extends AbstractEntity{

    @NotBlank(message = "Name required.")
    private String name;

    @NotBlank(message = "Email required.")
    @Email(message = "Must be valid email.")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})", message = "Must be valid 10-digit phone number.")
    private String phoneNumber;

    public Prospect(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Prospect () {};

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
