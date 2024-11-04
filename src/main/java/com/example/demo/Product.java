package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Product {

    @Id
    private int productId;
    private String productName;
    private int price;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public Product() {
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }
}
