package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.Encrypter.decprypt;
import static com.endava.Encrypter.encrypt;

public class EncrypterTest {

    @Test
    public void encryptionTest() {

        String inputString = "Hola";
        String expectedString = "Ipmb";

        String actualEncryptedString = encrypt(inputString);
        String actualDecryptedString = decprypt(actualEncryptedString);

        Assert.assertEquals(expectedString, actualEncryptedString);
        Assert.assertEquals(inputString, actualDecryptedString);
    }
}
