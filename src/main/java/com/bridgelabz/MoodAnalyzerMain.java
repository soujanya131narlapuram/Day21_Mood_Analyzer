package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the message");
        String message = scan.nextLine();
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer(message);
        moodAnalyzer1.analyZeMood();

        System.out.println("Enter the message");
        message = scan.nextLine();
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer(message);
        moodAnalyzer2.analyZeMood();


        System.out.println("Output For message==NULL");
        System.out.println("__________________________");
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);
        moodAnalyzer2.analyZeMood();

    }
}