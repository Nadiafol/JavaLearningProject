package com.orange.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    public static Random random = new Random();
    public static int getRandomInt (int min, int max) {
        if (min >=max){
            System.out.println("Minimal value should lower than max");
            return 0;
        }
        int delta = max -min;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt+min;
        return randomNumber;
    }
    public static int getRandomInt (int limit) {
        return  random.nextInt(limit);
    }
    public static double getRandomDouble (double limit) {
        if (limit<= 0){
            System.out.println("The limit should have a positive value");
            return 0;
        }
        return random.nextDouble()+limit;
    }
    public static boolean getRandomBoolean () {
        return random.nextBoolean();
    }
    public static String getRandomEmail () {
        String uuid= UUID.randomUUID().toString();
        String domain = "@gmail.com";
        return uuid+domain;
    }
    public static String generateValidRandomString (int length) {
        String acceptedChars="ABCEDFGHIJKLMNOPRSTQUWZabcdefghijklmnoprstquwz0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i< length; i++){
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In the iteration: i="+ i+" the assigned char is " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
    public static String generateInvalidRandomString(int length){
        String acceptedChars="!£$()_#/.;";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i= 0; i< length; i++){
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In the iteration: i="+ i +" the assigned char is " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
    }


