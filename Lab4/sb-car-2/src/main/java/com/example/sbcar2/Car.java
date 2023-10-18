package com.example.sbcar2;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand,model,color,registerNumber;
    private int years,price;
    public Car() {
    }
    public Car(String brand,String model,String color,String registerNumber, int years,int price,Owner owner){
        super();
        this.brand=brand;
        this.color=color;
        this.model=model;
        this.registerNumber=registerNumber;
        this.years=years;
        this.price=price;
        this.owner=owner;

    }
//
    // public Car(String brand,String model,String color,String registerNumber, String year,String price){
    //     this(UUID.randomUUID().toString(),brand,model,color,registerNumber,year,price);
    // }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRegisterNumber() {
        return registerNumber;
    }
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="owner")
    private Owner owner;
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    
    


}
