package associativeArrays_Exercise07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03_orders {
    public static void main(String[] args) {
        Map<String, Product> products = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                break;
            }

            String[] tokens = input.split(" ");
            String productName = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (products.containsKey(productName)) {
                Product existingProduct = products.get(productName);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
                if (existingProduct.getPrice() != price) {
                    existingProduct.setPrice(price);
                }
            } else {
                Product newProduct = new Product(price, quantity);
                products.put(productName, newProduct);
            }
        }

        for (Map.Entry<String, Product> entry : products.entrySet()) {
            String productName = entry.getKey();
            Product product = entry.getValue();
            double totalPrice = product.getPrice() * product.getQuantity();
            System.out.printf("%s -> %.2f%n", productName, totalPrice);
        }
    }
}

class Product {
    private double price;
    private int quantity;

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
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