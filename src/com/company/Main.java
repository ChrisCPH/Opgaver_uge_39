package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printLongestWord();

        //printWordsWithLessThanTwoVocals();

        //printFirstHalfOfEachWord();

        printMostFrequentLetter();
    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    private static void printLongestWord() {
        int wordLenght = 0;
        String longestWord = null;
        for (String s : text) {
            if (s.contains(",") || s.contains(".")) {
                s.split(",");
                s.split(".");
            } else if(s.length() > wordLenght) {
                wordLenght = s.length();
                longestWord = s;
            }
        }
        System.out.println("Longest word: "+ longestWord);
        System.out.println("Length of longest word: "+ wordLenght);
    }
    private static void printWordsWithLessThanTwoVocals(){
        char[] array1 = new char[]{'a','e','i','o','u','y','æ','ø','å'};
        for(String s : text){
            int counter = 0;
            if(s.contains(",") || s.contains(".")) {
                s.split(",");
                s.split(".");
            }
            if(s.contains(""))
            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < array1.length; j++){
                    if(s.charAt(i) == array1[j]) {
                        counter++;
                    }
                }
            }
            if(counter < 2){
                System.out.println(s);
            }
        }
    }
    private static void printFirstHalfOfEachWord(){
        for(String s : text){
            if(s.contains(",") || s.contains(".")) {
                s.split(",");
                s.split(".");
            }
            String firstHalf = s.substring(0,s.length()/2);
            System.out.println(firstHalf);
        }
    }
    private static void printMostFrequentLetter() {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å'};
        int counter = 0;
        char letter = ' ';
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    letter = s.charAt(i);
                    counter++;
                }
            }
        }
        System.out.println(counter);
        System.out.println(letter);
    }
}