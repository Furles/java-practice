package Palindrome;

public class Palindrom {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

            StringBuilder sb = new StringBuilder(s);
            String reversed = sb.reverse().toString();

            return s.equals(reversed);
    }

    public static void main(String[] args){
        Palindrom p = new Palindrom();

        System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(p.isPalindrome("kajak"));
        System.out.println(p.isPalindrome("Java"));



    }
}
//
//import java.util.Scanner;
//
//public class Palindrom {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj słowo. ");
//        String word = scan.nextLine();
//        scan.close();
//        String wordReversed = "";
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            wordReversed += word.charAt(i);
//        }
//        if (wordReversed.equalsIgnoreCase(word)){
//            System.out.println("To palindrom.");
//        } else {
//            System.out.println("To nie palindrom.");
//            System.out.println(word + " od tyłu to: " + wordReversed);
//        }
//    }
//}