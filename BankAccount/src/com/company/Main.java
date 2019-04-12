package com.company;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(1000);

        account.deposit(-1000);
        account.withdraw(1100);
        account.deposit(500);
        account.withdraw(200);

        System.out.println(account.toString());




    }
}
