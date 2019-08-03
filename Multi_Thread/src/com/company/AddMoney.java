package com.company;

public class AddMoney implements Runnable {
    private Account account;
    private double money;
    public AddMoney(Account account,double money){
        this.account = account;
        this.money=money;
    }
    @Override
    public void run(){
        synchronized (account){
            account.deposit(money);
        }
    }
}
