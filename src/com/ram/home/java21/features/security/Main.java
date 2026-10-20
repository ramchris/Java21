package com.ram.home.java21.features.security;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class Main {
    static void main(String[] args) throws Exception {
        // Step 1: Generate Asymmetric Key Pair
        KeyPair keyPair = AsymmetricKeyGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Step 2: Generate Symmetric Key
        SecretKey symmetricKey = SymmetricKeyGenerator.generateSymmetricKey();

        // Step 3: Encrypt Symmetric Key with Public Key
        byte[] encryptedKey = KeyEncapsulation.encapsulateKey(symmetricKey, publicKey);

        // Step 4: Decrypt Encrypted Key with Private Key
        byte[] decryptedKey = KeyDecapsulation.decapsulateKey(encryptedKey, privateKey);

        // Verify if the keys match
        if (java.util.Arrays.equals(symmetricKey.getEncoded(), decryptedKey)) {
            System.out.println("Keys match! Encapsulation and Decapsulation successful.");
        } else {
            System.out.println("Keys don't match! Encapsulation and Decapsulation failed.");
        }
    }
}
