package com.packtpub.j7cc.chapter2.recipe01_synchronizilig_a_method;

public class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            account.addAmount(1000);
        }
    }
}
