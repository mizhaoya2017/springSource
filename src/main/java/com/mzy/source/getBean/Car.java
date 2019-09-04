package com.mzy.source.getBean;

public class Car {
    private int maxSpeed;
    private String brand;
    private double price;
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
}
