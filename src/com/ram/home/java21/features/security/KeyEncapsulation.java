package com.ram.home.java21.features.security;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

public class KeyEncapsulation {
    public static byte[] encapsulateKey(Key symmetricKey, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(symmetricKey.getEncoded());
    }

    static void main() {
        try {
            SecretKey secretKey = SymmetricKeyGenerator.generateSymmetricKey();
            PublicKey publicKey = AsymmetricKeyGenerator.generateKeyPair().getPublic();
            byte[] encapsulatedKey = encapsulateKey(secretKey, publicKey);
            System.out.println("Encapsulated Key: " + encapsulatedKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
