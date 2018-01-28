package com.example.colinbell.downcount;

import java.util.ArrayList;

/**
 * Created by colinbell on 28/01/2018.
 */

public class WordBank {

    private ArrayList<String> letters;

    public WordBank(){
        this.letters = new ArrayList<>();
    }

    public void addLetter(String letter){
        this.letters.add(letter);
    }

    public void addLetter(String[] letters){
        for(String letter: letters){
            addLetter(letter);
        }
    }

    public ArrayList<String> getLetters() {
        return letters;
    }

    public int letterCount(){
        return this.letters.size();
    }

    public String prepWord(){
        StringBuilder sb = new StringBuilder();
        for(String letter : letters){
            sb.append(letter);
        }
        return sb.toString();
    }

}
