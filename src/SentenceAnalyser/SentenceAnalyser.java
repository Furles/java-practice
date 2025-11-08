package SentenceAnalyser;

import java.util.Scanner;

public class SentenceAnalyser {

    public static void main(String[] args){
        String sentence = getSentence();
        analyseSentence(sentence);


    }

    public static String getSentence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zdanie. ");
        String sentence = scan.nextLine();

        return sentence;
    }

    public static void analyseSentence(String sentence) {
        System.out.println("Ilość znaków: " + sentence.length());
        System.out.println("Ilość słów " + sentence.split("\\s").length);
        String[] space = sentence.split("");
        String[] word = sentence.split(" ");

        int charCount = 0;
        int spaceCount = 0;
        String longest = word[0];
        String shortest = word[0];

        for (String s  : space){
            charCount ++;
            if (s.equals(" ")) {
                spaceCount ++;
            }
        }
        for (String s : word){
            if (longest.length() < s.length()){
                longest = s;
            }
            if (shortest.length() > s.length()){
                shortest = s;
            }
        }

        System.out.println("Ilość znaków: " + charCount);
        System.out.println("Ilość spacji: " + spaceCount);
        System.out.println("Najdłuższe słowo : " + longest);
        System.out.println("Najkrótsze słowo: " + shortest);




    }

    }

