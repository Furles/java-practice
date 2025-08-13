import java.util.Scanner;

public class Palindrom {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a word. ");
        String word = scan.nextLine();
        String wordReversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            wordReversed += word.charAt(i);
        }
        if (wordReversed.equals(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word+ " is not a palindrome.");
        }
    }
}
