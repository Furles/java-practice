package NumberAnalyser_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyser {
    public static void main(String[] args){
        ArrayList<Integer> numbers = getNumbers();
        NumberStats numberStats = new NumberStats(numbers); numberStats.showResults();

    }

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile chcesz podać liczb? ");
        int quantity = scan.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Podaj liczbę. ");
            numbers.add(scan.nextInt());
        }
        scan.close();
        return numbers;
    }
}
