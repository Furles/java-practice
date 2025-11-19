package MillionaireGame;

public class Question {

    public enum answerOption {
        A, B, C, D
    }
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private answerOption correctAnswer;

    public Question(String question, String answerA, String answerB, String answerC, String answerD, answerOption correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {return question;}
    public String getAnswerA() {return answerA;}
    public String getAnswerB() {return answerB;}
    public String getAnswerC() {return answerC;}
    public String getAnswerD() {return answerD;}




}
