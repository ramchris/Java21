package com.ram.home.java21.features.security;

import javax.crypto.Cipher;
import java.security.Key;
import java.security.PrivateKey;

public class KeyDecapsulation {
    public static byte[] decapsulateKey(byte[] encryptedKey, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(encryptedKey);
    }
}
