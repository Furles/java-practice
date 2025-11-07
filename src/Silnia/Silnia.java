package Silnia;

import java.util.Scanner;

public class Silnia {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę większą niż 0.");
        int silnia = 1;
        int i = scan.nextInt();
        scan.close();

        if (i < 1){
            System.out.println("Podaj większa niż 0. ");
        } else {
            for (int b = i; b >= 1; b--) {
                silnia *= b;
            }
            System.out.println(i + "! wynosi: " + silnia);

        }
    }
}