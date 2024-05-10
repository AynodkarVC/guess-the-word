package com.aynodkar.guesstheword.guesstheword.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class GameService {
    private String randomlyChoosenWord = null;
    private String[] randomWords = {"father","mother","sister","tree","mountain","light","java"};
    private char[] allCharofTheWord;
    Random random = new Random();

    public GameService(){
        randomlyChoosenWord = randomWords[random.nextInt(randomWords.length)];
        allCharofTheWord = randomlyChoosenWord.toCharArray();
        System.out.println("randomly choosen word is: " + randomlyChoosenWord);
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();

        for (char c : allCharofTheWord) {
            if (c == '\u0000') {
                ret.append("_");
            } else {
                ret.append(c);
            }
        }

        return ret.toString();
    }

}
