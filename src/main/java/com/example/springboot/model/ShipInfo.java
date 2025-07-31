package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ship_info")
public class ShipInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "reciever", length = 50)
    private String receiver;

    @Column(name = "phone", length = 10)
    private String phone;

    @Column(name = "address", length = 100)
    private String address;

    // Constructors
    public ShipInfo() {}

    public ShipInfo(User user, String receiver, String phone, String address) {
        this.user = user;
        this.receiver = receiver;
        this.phone = phone;
        this.address = address;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
} 