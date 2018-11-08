package com.mint.customerdemo.model;


import javax.persistence.*;

@Entity
@Table(name = "T_ANIMAL")
public class Customer {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            if (this.getId() == ((Customer) obj).getId()) return true;
        }
        return false;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "address", length = 500)
    private String address;

    @Column(name="delete_flag")
    private String deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
