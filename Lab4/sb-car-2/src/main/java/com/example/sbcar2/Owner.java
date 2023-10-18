package com.example.sbcar2;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ownerid;
    private String firstname,lastname;
    public Owner() {
    }
    public Owner(String firstname,String lastname) {
        super();
        this.firstname=firstname;
        this.lastname=lastname;
    }
@JsonIgnore
    @OneToMany(cascade =CascadeType.ALL,mappedBy="owner")

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
}

public String getLastname() {
    return lastname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}




}
