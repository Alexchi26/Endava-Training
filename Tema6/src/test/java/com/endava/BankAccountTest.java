package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void accountActionsTest() {

        BankAccount testAccount = new BankAccount(100.50, 4235342);

        testAccount.withdraw(120.35);

        Assert.assertEquals(100.50, testAccount.getBalance(), 2);

        testAccount.deposit(50);
        testAccount.withdraw(120.35);

        Assert.assertEquals(30.15, testAccount.getBalance(), 2);

        Assert.assertEquals(4235342, testAccount.getAccountNumber());
    }
}
