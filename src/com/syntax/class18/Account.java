package com.syntax.class18;

public class Account {

    private String userName="Teyfur";
    private String passWord="Admin";
    public String accountNumber="123456";
    private double balance=-1500;

    private void printUserName(){
        System.out.println(userName);
    }

    protected void printPassWord(){
        System.out.println(passWord);
    }

    void printBalance(){
        System.out.println(balance);
    }

    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {

                Account account=new Account();

                account.printUserName();
                account.printPassWord();
                account.printBalance();
                account.printAccountNumber();








    }








}
