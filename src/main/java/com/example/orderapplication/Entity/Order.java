package com.example.orderapplication.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="orders_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long OrderID;
    private String productName;
    private double price;
    private int quantity;

    public Long getOrderID() {
        return OrderID;
    }

    public void setOrderID(Long orderID) {
        OrderID = orderID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
