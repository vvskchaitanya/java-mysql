# Java MySQL Connection Tutorial

Welcome to the **Java MySQL Connection Tutorial** repository! This project demonstrates how to connect a Java application to a MySQL database and perform basic CRUD (Create, Read, Update, Delete) operations. Whether you're a beginner or looking to brush up on your JDBC skills, this tutorial is designed to guide you through the process step by step.

## Features

- **Simple and clear examples**: Understand the basics of JDBC with straightforward code examples.
- **CRUD operations**: Learn how to create, read, update, and delete records in a MySQL database.
- **Setup instructions**: Detailed setup instructions for MySQL and Java environment.
- **Best practices**: Follow best practices for managing database connections and handling SQL exceptions.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [1. Setting Up MySQL](#1-setting-up-mysql)
  - [2. Setting Up the Java Project](#2-setting-up-the-java-project)
  - [3. Adding MySQL Connector/J to Your Project](#3-adding-mysql-connectorj-to-your-project)
  - [4. Writing Java Code for CRUD Operations](#4-writing-java-code-for-crud-operations)
- [Running the Project](#running-the-project)

  ## Prerequisites

Before you begin, ensure you have the following:

- JDK (Java Development Kit) installed on your system.
- MySQL Server installed and running.
- MySQL Workbench or any other MySQL client to manage your database.

## Getting Started

### 1. Setting Up MySQL

1. Install MySQL Server from the [official MySQL website](https://dev.mysql.com/downloads/mysql/).
2. Create a new database:
    ```sql
    CREATE DATABASE fullstack;
    ```
3. Create a `products` table:
    ```sql
    USE fullstack;
    CREATE TABLE products (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        price DECIMAL(10, 2) NOT NULL,
        quantity INT NOT NULL
    );
    ```

### 2. Setting Up the Java Project

1. Open your preferred Java IDE (Eclipse, IntelliJ, or VS Code).
2. Create a new Java project.

### 3. Adding MySQL Connector/J to Your Project

Download the MySQL Connector/J JAR file from the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/) and add it to your project:

- **Eclipse**: Right-click on the project -> Build Path -> Add External Archives -> Select the JAR file.
- **IntelliJ**: File -> Project Structure -> Modules -> Dependencies -> + -> JARs or directories -> Select the JAR file.
- **VS Code**:
  - Create a `lib` folder in your project root.
  - Place the JAR file in the `lib` folder.
  - Update the `.classpath` file to include the JAR.
