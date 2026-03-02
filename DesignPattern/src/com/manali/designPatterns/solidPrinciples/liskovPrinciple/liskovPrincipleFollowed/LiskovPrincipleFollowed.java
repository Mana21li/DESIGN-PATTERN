package com.manali.designPatterns.solidPrinciples.liskovPrinciple.liskovPrincipleFollowed;

import java.util.ArrayList;
import java.util.List;

public class LiskovPrincipleFollowed {
    public static void main(String[] args) {
        List<WithdrawableAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount());
        accounts.add(new CurrentAccount());
        List<NonWithdrawableAccount> nonAccounts = new ArrayList<>();
        nonAccounts.add(new FixedDepositAccount());

        BankClient client =  new BankClient(accounts,  nonAccounts);
        client.processTrasaction();
    }
}

class BankClient {
    List<WithdrawableAccount> accounts;
    List<NonWithdrawableAccount> nonAccounts;

    public BankClient(List<WithdrawableAccount> accounts, List<NonWithdrawableAccount> nonAccounts) {
        this.accounts = accounts;
        this.nonAccounts = nonAccounts;
    }

    public void processTrasaction() {
        for (WithdrawableAccount account : accounts) {
            account.deposit(1000.00);
            account.withdraw(500.00);
        }
        for (NonWithdrawableAccount account : nonAccounts) {
            account.deposit(500.00);
        }
    }
}

interface NonWithdrawableAccount {
    void deposit(double money);
}

interface WithdrawableAccount extends NonWithdrawableAccount {
    void withdraw(double money);
}

class SavingsAccount implements WithdrawableAccount {
    private double balance;

    public SavingsAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Savings account. Current Balance is: " + balance);
    }
    @Override
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn : " + money + " in Savings account. Current Balance is: " + balance);
        } else  {
            System.out.println("Not enough money");
        }
    }
}

class CurrentAccount implements WithdrawableAccount {
    private double balance;

    public CurrentAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Current account. Current Balance is: " + balance);
    }
    @Override
    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Withdrawn : " + money + " in Current account. Current Balance is: " + balance);
        } else  {
            System.out.println("Not enough money");
        }
    }
}

class FixedDepositAccount implements NonWithdrawableAccount {
    private double balance;

    public FixedDepositAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double money) {
        balance += money;
        System.out.println("Deposited: " + money + " in Fixed deposit account. Current Balance is: " + balance);
    }
}

