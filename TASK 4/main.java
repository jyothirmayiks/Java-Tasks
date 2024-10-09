package org.example.multithreadeddbfetcher;

public class Main {
    public static void main(String[] args) {

        Thread employeesThread = new DataFetcherThread("Employees");
        Thread departmentsThread = new DataFetcherThread("Departments");
        Thread projectsThread = new DataFetcherThread("Projects");


        try {
            employeesThread.start();
            employeesThread.join();

            departmentsThread.start();
            departmentsThread.join();

            projectsThread.start();
            projectsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}