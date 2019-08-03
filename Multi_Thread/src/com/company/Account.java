package com.company;

public class Account {
    private double balance;//账户余额
    public  synchronized void deposit(double money){
        double newBalance = balance+money;
        try{
            Thread.sleep(10);
        }//让线程休眠一段时间
        catch (InterruptedException e){
            e.printStackTrace();
        }
        balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }


}
