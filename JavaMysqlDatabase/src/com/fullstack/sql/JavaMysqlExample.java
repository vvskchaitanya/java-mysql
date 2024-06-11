package com.fullstack.sql;

public class JavaMysqlExample {

    public static void main(String[] args) {

        ProductsService service = new ProductsService();

        // Add Product into Products Table
        service.create("Laptop", 1200.50, 10);

        // Read from the Products table
        service.read();

    }

}
