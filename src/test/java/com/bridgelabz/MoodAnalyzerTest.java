package com.bridgelabz;

import org.junit.jupiter.api.*;

public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer;

    @Test
    public void testAnalyseMood(){
        moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyZeMood();
        Assertions.assertEquals(result,"SAD");

        moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        result = moodAnalyzer.analyZeMood();
        Assertions.assertEquals(result,"HAPPY");

        // returns HAPPY for null value

        moodAnalyzer = new MoodAnalyzer(null);
        result = moodAnalyzer.analyZeMood();
        Assertions.assertEquals(result,"HAPPY");

    }
}