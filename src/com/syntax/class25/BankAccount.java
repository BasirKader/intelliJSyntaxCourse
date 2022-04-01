package com.syntax.class25;

public class BankAccount {
    private double balance = 1235;
    private String userName = "Habib";
    private String passWord = "Habib123";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    void printBalance(String userName, String passWord) {
        if (userName.equals(this.userName) && passWord.equals(this.passWord)) {
            System.out.println(balance);
        } else {
            System.out.println("username and password is not correct");
        }

    }
}
