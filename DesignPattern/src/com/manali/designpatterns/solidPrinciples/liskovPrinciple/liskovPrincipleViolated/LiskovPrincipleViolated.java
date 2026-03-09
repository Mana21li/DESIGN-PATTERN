package com.manali.designpatterns.solidPrinciples.liskovPrinciple.liskovPrincipleViolated;

import java.util.ArrayList;
import java.util.List;

public class LiskovPrincipleViolated {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount());
        accounts.add(new CurrentAccount());
        accounts.add(new FixedAccount());

        BankClient client =  new BankClient(accounts);
        client.processTrasaction();
    }
}

class BankClient {
    List<Account> accounts;

    public BankClient(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void processTrasaction() {
        for (Account account : accounts) {
            account.deposit(1000.00);
            try {
                account.withdraw(500.00);
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

interface Account {
    public void deposit(double money);
    public void withdraw(double money);
}

class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Savings Account. Current Balance is: " + balance);
    }
    @Override
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn : " + money + " in Savings Account. Current Balance is: " + balance);
        } else  {
            System.out.println("Not enough money");
        }
    }
}

class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Current Account. Current Balance is: " + balance);
    }
    @Override
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn : " + money + " in Current Account. Current Balance is: " + balance);
        } else  {
            System.out.println("Not enough money");
        }
    }
}

class FixedAccount implements Account {
    private double balance;

    public FixedAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Fixed Account. Current Balance is: " + balance);
    }
    @Override
    public void withdraw(double money) {
        throw new UnsupportedOperationException("Withdrawal not allowed");
    }
}
