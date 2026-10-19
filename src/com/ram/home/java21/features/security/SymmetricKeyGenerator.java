package com.ram.home.java21.features.security;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SymmetricKeyGenerator {
    public static SecretKey generateSymmetricKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // Key size
        return keyGen.generateKey();
    }

    static void main() {
        try {
            SecretKey secretKey = generateSymmetricKey();
            System.out.println("Generated Secret Key: " + secretKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
