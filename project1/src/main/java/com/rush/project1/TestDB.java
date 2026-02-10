package com.rush.project1;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/product_db?useSSL=false&serverTimezone=UTC",
                "root", "root123"
        );
        System.out.println("Connected!");
        conn.close();
    }
}
