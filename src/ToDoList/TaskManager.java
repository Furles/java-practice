package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description){
        tasks.add(new Task(title, description));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań na liście. ");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println(tasks.get(i));
            System.out.println("---------------");
        }
    }


    public void markTaskAsDone(int id) {
        if (id < 0 || id >= tasks.size()) {
            System.out.println("Niepoprawne ID zadania! ");
            return;
        }
        tasks.get(id).markAsDone();
        System.out.println("Zadanie oznaczone jako wykonane. ");
    }

    public void removeTask(int id) {
        if (id < 0 || id >=tasks.size()) {
            System.out.println("Niepoprawne ID zadania! ");
            return;
        }
        tasks.remove(id);
        System.out.println("Zadanie usunięte! ");
    }
}
