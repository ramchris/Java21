package com.ram.home.java21.features.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class AsymmetricKeyGenerator {
    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // Key size
        return keyGen.generateKeyPair();
    }

    static void main() {
        try {
            KeyPair keyPair = generateKeyPair();
            System.out.println("Generated Key Pair: " + keyPair);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}