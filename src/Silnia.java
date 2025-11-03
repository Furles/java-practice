import java.util.Scanner;

public class Silnia {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę. ");
        int number = scan.nextInt();
        int silnia = 1;

        if (number <= 0 ) {
            System.out.println("Podaj liczbę większą od 0. ");
        } else {
            for (int i = number; i >= 1; i--) {
                silnia *= i;
            }
            System.out.println(number + "! wynosi " + silnia);
        }
    }
}
