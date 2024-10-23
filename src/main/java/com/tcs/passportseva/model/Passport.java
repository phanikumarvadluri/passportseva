package com.tcs.passportseva.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="passport")
public class Passport {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="office")
    private String offcie;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="dob")
    private String dob;

    public String getOffcie() {
        return offcie;
    }

    public void setOffcie(String offcie) {
        this.offcie = offcie;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
