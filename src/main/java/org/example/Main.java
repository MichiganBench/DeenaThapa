package org.example;

import java.util.Scanner;
import org.example.models.Bill;
import org.example.models.Avaliable;
import java.sql.*;

public class Main {
    public static final String INSTRUMENT_TABLE = "INSTRUMENT";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String url = "jdbc:sqlite:library.db";
        System.out.print("Enter Name:");
        String Name= sc.next();
        System.out.print("Enter Address:");
        String Address=sc.next();
        System.out.print("Enter Phone Number: ");
        String pnum=sc.next();
        Bill u1=new Bill(2,4,3,3,5);
        String createStatementSql = "CREATE TABLE IF NOT EXISTS " + INSTRUMENT_TABLE + "(" +
                "id INTEGER PRIMARY KEY , " +
                "Name TEXT, " +
                "Address TEXT, " +
                "PhoneNum TEXT, " +
                "EnglishBook INTEGER, " +
                "MathBook INTEGER,"+
                "ScienceBook INTEGER,"+
                "ComputerBook INTEGER,"+
                "GeographyBook INTEGER)";
        System.out.println(createStatementSql);
                

        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");


            Statement statement = connection.createStatement();

            statement.execute(createStatementSql);



            String insertRecordSQL = "INSERT INTO " + INSTRUMENT_TABLE + " (Name, Address, PhoneNum, EnglishBook, MathBook, ScienceBook, ComputerBook, GeographyBook) " +
                    "VALUES (?,?,?,?,?,?,?,?)";



            PreparedStatement preparedStatement = connection.prepareStatement(insertRecordSQL);

            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Address);
            preparedStatement.setString(3,pnum);
            preparedStatement.setInt(4,u1.getEnglishBook());
            preparedStatement.setInt(5, u1.getMathBook());
            preparedStatement.setInt(6, u1.getScienceBook());
            preparedStatement.setInt(7,u1.getComputerBook());
            preparedStatement.setInt(8,u1.getGeographyBook());

            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        double EnglishBook = 300.0;
        double MathBook = 100.0;
        double ScienceBook = 800.0;
        double ComputerBook = 200;
        double GeographyBook = 500;

        Avaliable ava = new Avaliable();
        ava.addItem("English Book", 20);
        ava.addItem("Math Book", 5);
        ava.addItem("Science Book", 7);
        ava.addItem("Computer Book",2);
        ava.addItem("Geography Book", 10);
        ava.displayStock();

        u1.billgen();
    }


}