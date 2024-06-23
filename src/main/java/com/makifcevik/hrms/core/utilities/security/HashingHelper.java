package com.makifcevik.hrms.core.utilities.security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class HashingHelper
{
    public static void createPasswordHash(String password, byte[] passwordHash, byte[] passwordSalt) throws NoSuchAlgorithmException
    {
        SecureRandom random = new SecureRandom();
        passwordSalt = new byte[16];
        random.nextBytes(passwordSalt);

        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(passwordSalt);
        passwordHash = md.digest(password.getBytes(StandardCharsets.UTF_8));
    }

    public static boolean verifyPassword(String password, byte[] passwordHash, byte[] passwordSalt) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(passwordSalt);
        byte[] computedHash = md.digest(password.getBytes(StandardCharsets.UTF_8));

        return Arrays.equals(computedHash, passwordHash);
    }
}
