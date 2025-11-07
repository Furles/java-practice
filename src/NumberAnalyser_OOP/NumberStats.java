package NumberAnalyser_OOP;

import java.util.ArrayList;

public class NumberStats {

    private ArrayList<Integer> numbers = new ArrayList<>();
    private int min;
    private int max;
    private double average;

    public NumberStats(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        this.min = findMin();
        this.max = findMax();
        this.average = calculateAverage();
    }

    public int findMin() {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        return min;
    }
    public int findMax() {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public double calculateAverage() {
        int quantity = numbers.size();
        double sum = 0;

        for (int i = 0; i < quantity; i++){
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();
        return average;
    }

    public void showResults(){

        System.out.println(
                "Twoje liczby to: " + numbers +
                        "\nNajmniejsza liczba to: " + min +
                        "\nNajwiększa liczba to: " + max +
                        "\nŚrednia wynosi: " + average);

    }



}
