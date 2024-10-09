package org.example.multithreadeddbfetcher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class dataFetching extends Thread {
    private String tableName;

    public dataFetching(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public void run() {
        System.out.println("Data from table: " + tableName);
        try (Connection connection =dbConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {


            int columnWidth = 22;


            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = resultSet.getMetaData().getColumnName(i);
                System.out.printf("%-" + columnWidth + "s", columnName);
            }
            System.out.println();


            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-" + columnWidth + "s", resultSet.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
