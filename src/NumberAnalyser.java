import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyser {
    public static void main(String[] args){
        ArrayList<Integer> numbers = getNumbers();
        int min = findMin(numbers);
        int max = findMax(numbers);
        double average = calculateAverage(numbers);
        showResults(numbers, min, max, average);
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

    public static int findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        return min;
    }
    public static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static double calculateAverage(ArrayList<Integer> numbers) {
        int quantity = numbers.size();
        double sum = 0;

        for (int i = 0; i < quantity; i++){
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();
        return average;
    }
    public static void showResults(ArrayList<Integer> numbers, int min, int max, double average){


        System.out.println(
                "Twoje liczby to: " + numbers +
                "\nNajmniejsza liczba to: " + min +
                "\nNajwiększa liczba to: " + max +
                "\nŚrednia wynosi: " + average);

    }
}