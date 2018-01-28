package com.example.colinbell.downcount;

import java.util.Random;

/**
 * Created by colinbell on 28/01/2018.
 */

public class LetterSelecter {

    public String getLetter(LetterChoice choice) {
        return choice == LetterChoice.VOWEL ? String.valueOf(Vowel.values()[new Random().nextInt(Vowel.values().length)]) : String.valueOf(Consonant.values()[new Random().nextInt(Consonant.values().length)]);
    }

}
