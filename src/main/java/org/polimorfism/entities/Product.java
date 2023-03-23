package org.polimorfism.entities;

public class Product {

    String name;
    Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag() {
        return "Name: " + name +
                String.format(" Price: $%.2f", price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
