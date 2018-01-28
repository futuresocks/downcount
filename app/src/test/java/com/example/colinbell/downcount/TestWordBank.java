package com.example.colinbell.downcount;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by colinbell on 28/01/2018.
 */

public class TestWordBank {

    WordBank wordBank;
    ArrayList<String> expected;

    @Before
    public void setup(){
        wordBank = new WordBank();
        expected = new ArrayList<>();
        expected.add("W");
        expected.add("O");
        expected.add("W");
    }

    @Test
    public void wordbankStartsEmpty(){
        assertEquals(0, wordBank.letterCount());
    }

    @Test
    public void wordbankTakesString(){
        wordBank.addLetter("C");
        assertEquals(1, wordBank.letterCount());
    }

    @Test
    public void wordBankTakesStringArray(){
        String[] lettersToAdd = {"W", "O", "W"};
        wordBank.addLetter(lettersToAdd);
        assertEquals(3, wordBank.letterCount());
    }

    @Test
    public void wordbankReturnsLetters(){
        String[] lettersToAdd = {"W", "O", "W"};
        wordBank.addLetter(lettersToAdd);
        assertEquals(expected, wordBank.getLetters());
    }

    @Test
    public void wordbankBuildsWords(){
        String[] lettersToAdd = {"P", "I", "Z", "Z", "A"};
        wordBank.addLetter(lettersToAdd);
        assertEquals("PIZZA", wordBank.prepWord());
    }

}
