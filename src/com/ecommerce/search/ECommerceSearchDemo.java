package com.ecommerce.search;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Apple Watch", "Electronics"),
            new Product(2, "Bluetooth Speaker", "Electronics"),
            new Product(3, "Coffee Mug", "Home"),
            new Product(4, "Desk Lamp", "Furniture"),
            new Product(5, "Earphones", "Electronics")
        };

        // Linear Search
        Product linearResult = SearchUtils.linearSearch(products, "Coffee Mug");
        System.out.println("Linear Search Result: " + linearResult);

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        Product binaryResult = SearchUtils.binarySearch(products, "Coffee Mug");
        System.out.println("Binary Search Result: " + binaryResult);
    }
}
