package org.polimorfism.entities;

public class ImportedProduct extends Product {

    Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return "Name: " + name +
                String.format(" Price: $%.2f", totalPrice()) + String.format(" (Custom fee : $%.2f)", customFee);
    }

    public double totalPrice() {
        return price + customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
