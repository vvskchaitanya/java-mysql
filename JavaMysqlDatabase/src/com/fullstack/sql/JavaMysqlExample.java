package com.fullstack.sql;

public class JavaMysqlExample {

    public static void main(String[] args) {

        // Add Product into Products Table
        ProductsService.create("Laptop", 1200.50, 10);

        // Read from the Products table
        ProductsService.read();

    }

}
