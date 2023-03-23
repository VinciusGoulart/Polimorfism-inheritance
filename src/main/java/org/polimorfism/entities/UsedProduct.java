package org.polimorfism.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {

        return "Name: " + name + "(used)" +
                String.format(" Price: $%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
