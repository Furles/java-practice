import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args){
        Random random = new Random();
        final int MIN = 1;
        final int MAX = 101;
        int number = random.nextInt(MIN, MAX);
        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 100. ");
        int guess = 0;
        int attempts = 0;

        while (number != guess) {
            guess = scan.nextInt();
            attempts ++;
            if (number > guess) {
                System.out.println("Twoja liczba jest za mała. ");
            } else if (number < guess ) {
                System.out.println("Twoja liczba jest za duża. ");
            } else {
                System.out.println("Brawo, udało Ci się! Ilość prób: " + attempts);
            }
        }
        scan.close();


    }
}
