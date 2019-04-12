package com.company;

import java.util.Random;

public class Account {

    private String accountNumber;
    private int money;
    private int depositAmount;
    private int withdrawal;

    @Override
    public String toString(){
        return String.format("your accound number is:" + accountNumber + " and your amount is:" + money);
    }

    public Account(int amount) {
        Random random = new Random();
        accountNumber = "AN:" + random.nextInt();
        money = amount;
    }

    public int getMoney() {
        return money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public  void  deposit (int depositAmount){

        if(depositAmount<0){
            System.out.println("you cannot deposit this amount");
        }else{
            money = money+ depositAmount;
            System.out.println("your new amount is: " + money );
        }

    }

    public void withdraw(int withdrawal){

        if(withdrawal> money){
            System.out.println("your amount is not that much");
        }
        else {
            money = money-withdrawal;
            System.out.println("your now amount is: " + money);
        }
    }


}
