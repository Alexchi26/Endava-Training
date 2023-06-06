package com.endava;

import com.endava.Bank.Bank;
import com.endava.Bank.BankA;
import com.endava.Bank.BankB;
import com.endava.Bank.BankC;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    @Test
    public void bankTest() {

        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        Assert.assertEquals(100, bankA.getBalance());
        Assert.assertEquals(150, bankB.getBalance());
        Assert.assertEquals(200, bankC.getBalance());
    }
}
