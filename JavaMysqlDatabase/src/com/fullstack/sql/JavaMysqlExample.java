package com.fullstack.sql;

public class JavaMysqlExample {

    public static void main(String[] args) {
        create("Laptop", 1200.50, 10);
        read();
        update(1, "Gaming Laptop", 1500.75, 5);
        read();
        delete(1);
        read();
    }

}
