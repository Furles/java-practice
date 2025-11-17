package ToDoList;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("To-Do List Menu. ");
            System.out.println("1. Dodaj zadanie. ");
            System.out.println("2. Wyświetl zadanie. ");
            System.out.println("3. Oznacz zadanie jako wykonane. ");
            System.out.println("4. Usuń zadanie.");
            System.out.println("5. Zakończ.");
            System.out.println("Wybierz opcję.");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Podaj tytuł zadania.");
                    String title = scan.nextLine();

                    System.out.println("Podaj opis zadania.");
                    String description = scan.nextLine();

                    taskManager.addTask(title, description);
                    System.out.println("Dodano zadanie! ");
                    break;

                case 2:
                    taskManager.listTasks();
                    break;

                case 3:
                    System.out.println("Podaj ID zadania do odznaczenia. ");
                    int idDone = scan.nextInt();
                    taskManager.markTaskAsDone(idDone);
                    break;

                case 4:
                    System.out.println("Podaj ID zadania do usunięcia. ");
                    int idRemove = scan.nextInt();
                    taskManager.removeTask(idRemove);
                    break;

                case 5:
                    System.out.println("Zamykanie programu.");
                    scan.close();
                    break;

                default:
                    System.out.println("Niepoprawna opcja, spróbuj ponownie. ");

            }






        }

    }
}
