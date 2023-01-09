package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the message");
            String message = scan.nextLine();
            MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer(message);
            moodAnalyzer1.analyZeMood();

            System.out.println("Enter the message");
            message = scan.nextLine();
            MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer(message);
            moodAnalyzer2.analyZeMood();

            // NULL case
            System.out.println("Output for null message");
            System.out.println("__________________________");
            MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);
            moodAnalyzer3.analyZeMood();

            // Empty case

            System.out.println("OUTPUT For message as Empty");
            System.out.println("__________________________");
            MoodAnalyzer moodAnalyzer4 = new MoodAnalyzer("");
            moodAnalyzer3.analyZeMood();
        } catch(MoodAnalysisException e){
            System.out.println(e.getMessage());
        }
    }
}
