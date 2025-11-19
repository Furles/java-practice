package MillionaireGame;

import java.util.Scanner;

public class MillionaireGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    }
    public void askQuestion(Question q) {
        System.out.println(q.getQuestion());
        System.out.println("A: " + q.getAnswerA());
        System.out.println("A: " + q.getAnswerB());
        System.out.println("A: " + q.getAnswerC());
        System.out.println("A: " + q.getAnswerD());
    }

    public void startGame() {

    }
}
