package org.polimorfism.aplication;

import org.polimorfism.entities.ImportedProduct;
import org.polimorfism.entities.Product;
import org.polimorfism.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common,used or imported (c, u, i)? ");
            char type = sc.next().toLowerCase().charAt(0);

            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customFee));

            } else if
            (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());

                products.add(new UsedProduct(name, price, date));
            } else if (type == 'c') {
                products.add(new Product(name, price));
            } else System.out.println("This type of item doesn't exist");


        }

        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}