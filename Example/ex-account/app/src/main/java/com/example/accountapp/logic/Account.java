package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    final OutputInterface mOut;

    String name;
    int number;
    double balance;

    /**
     * Constructor initializes the field
     */
    public Account(OutputInterface out) {
        mOut = out;
    }

    // Important note on constructors...
    // Each constructor that you add should take an OutputInterface parameter that
    // is used to initialize mOut (similar to the constuctor above).
    // Please remember to add that parameter to the code that you see in the lectures.

    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public void withdrawal(double amount) {
        if (balance > amount)
            balance -= amount;
        else 
            mOut.println("Insufficient Funds");
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }
}
