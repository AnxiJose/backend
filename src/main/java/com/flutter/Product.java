package com.flutter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class Product{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) { // try another way of doing this
        this.email=email;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public void setProduct(String email, String password) {
        this.email=email;
        this.password=password;
    }
    @Override
    public String toString() {
        return "Product{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}