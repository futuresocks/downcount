package com.example.colinbell.downcount;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by colinbell on 28/01/2018.
 */

public class TestLetterSelecter {

    LetterSelecter letterSelecter;
    LetterSelecter spySelecter;
    LetterChoice consonant;
    LetterChoice vowel;

    @Before
    public void setup(){
        letterSelecter = new LetterSelecter();
        spySelecter = Mockito.spy(letterSelecter);
        consonant = LetterChoice.CONSONANT;
        vowel = LetterChoice.VOWEL;
    }

    @Test
    public void canSelectConsonant(){
        Mockito.when(spySelecter.getLetter(consonant)).thenReturn("B");
        assertEquals("B", spySelecter.getLetter(consonant));
    }

    @Test
    public void canSelectVowel(){
        Mockito.when(spySelecter.getLetter(vowel)).thenReturn("E");
        assertEquals("E", spySelecter.getLetter(vowel));
    }

}
