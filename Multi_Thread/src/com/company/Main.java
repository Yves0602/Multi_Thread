package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);

        for (int i = 1; i <= 100; i++) {
            service.execute(new AddMoney(account, 1));
        }
        service.shutdown();
        while (!service.isTerminated()) {
        }
        System.out.println("账户余额：" + account.getBalance());

    }
}
