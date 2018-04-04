package com.a3abcarinho.ahmed.javalib;
import java.util.Random;


public class JokesClass {
    private static String [] jokes;

    public JokesClass(){
        jokes = new String[5];
        jokes[0] = "Can you just laugh?!";
        jokes[1] = "I am a programmer i dont know any jokes";
        jokes[3] = "why dont you just laugh!";
        jokes[4] = "If you didnt laugh i cant complete my nanodegree";
        jokes[5] = "i have a 4gb Ram..now cry for me";




    }

    public static String randomJokes(){
        Random randomizer = new Random();
        int randomIndex = randomizer.nextInt(jokes.length);
        return jokes[randomIndex];
    }


}
