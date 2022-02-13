package com.company;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Nursutan","Seitnur",23,"Mail","22/10/2003","##343dsaFsad");
        Validator checker = new Validator();

        user1.setPassword("!Abbbb#sssd");

        System.out.println("Data is loading");
        System.out.println("...");

        System.out.println("Data is loaded");
        System.out.println(" ");
        System.out.println("Checking data");
        System.out.println("...");
        System.out.println("Checking data finished: ");

        System.out.println(checker.checkAge());

        System.out.println(" ");
        checker.checkPass();

        checker.checkData();

        user1.print();

    }
}
