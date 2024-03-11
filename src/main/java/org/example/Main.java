package org.example;

import java.sql.*;
import org.example.connectDB;


import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final String ShopManagement = "connectDB";
    private static String insertQuery;
    private static String url;

    public static void main(String[] args) {


        try {
            Connection c = DriverManager.getConnection(url);
            System.out.println("CONNECTED");
            Statement statement = c.createStatement();
            System.out.println("Code executed successfully");

            PreparedStatement preparedStatement = c.prepareStatement(insertQuery);
            connectDB s1 = new connectDB("The Little Prince", 1000, 50);
            connectDB s2 = new connectDB("The Diary of a Young Girl", 999, 20);
            connectDB s3 = new connectDB("To Kill a Mockingbrid", 700, 45);
            connectDB s4 = new connectDB("1984", 1200, 10);


            preparedStatement.setString(1, s1.getName());
            preparedStatement.setInt(3, s2.getQuantity());
            preparedStatement.setInt(4, s3.getPrice());


            System.out.println("Values inserted");

        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}