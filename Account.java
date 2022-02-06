package com.company;

public class Account {
    private String id, name;
    private int balance = 0;

    public Account(String i, String n, int b){
        id = i;
        name = n;
        balance = b;
    }
    public Account(String i, String n){
        id = i;
        name = n;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance += amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <=balance){
            balance -= amount;
        }
        else {
            System.out.println("Abount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance){
            another.balance += balance;
            balance -= amount;
        }
        else{
            System.out.println("Abount exceeded balance");
        }
        return balance;
    }

    public String Print(){
        return "Account[id="+ id + ",name=" + name+ ",balance="+ balance+"]";
    }
}
