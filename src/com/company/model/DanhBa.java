package com.company.model;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private Integer id;
    private String numberPhone;
    private String name;
    private String sex;
    private String date;
    private String email;
    private String  address;

public DanhBa(){

}

    public DanhBa(Integer id, String numberPhone, String name, String sex, String date, String email, String address) {
        this.id = id;
        this.numberPhone = numberPhone;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.email = email;
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "id=" + id +
                ", numberPhone='" + numberPhone + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
