package com.devenzo.neuromarket.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component
@Entity
@Table(name = "influencer")
public class Influencer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String userName;

    private String phone;

    private String nationality;

    private String country;

    private String city;

    private String gender;

    private String fieldOi;

    private String status;

    private String tag;

    private String serviceType;


    public Influencer() {
    }

    public Influencer(int id, String name, String userName, String phone, String nationality, String country, String city, String gender, String fieldOi, String status, String tag, String serviceType) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.phone = phone;
        this.nationality = nationality;
        this.country = country;
        this.city = city;
        this.gender = gender;
        this.fieldOi = fieldOi;
        this.status = status;
        this.tag = tag;
        this.serviceType = serviceType;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFieldOi() {
        return fieldOi;
    }

    public void setFieldOi(String fieldOi) {
        this.fieldOi = fieldOi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
