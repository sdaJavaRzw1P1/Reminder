package pl.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zadanie4 {

    public static class Worker{
        String name;
        String surname;

        public Worker(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Worker() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }

    public static void main(String[] args) {

        List<Worker> workers = Arrays.asList(new Worker("Janek", "Kowalski"),
                new Worker("Maria", "Milska"),
                new Worker("Antonia", "Malinowska"),
                new Worker("Zawisza", "Czarny"),
                new Worker("Barnaba", "Kuśnierz"),
                new Worker("Ulka", "Marus"),
                new Worker("Dawid", "Wyczesany"),
                new Worker("Jan", "Kowalski"),
                new Worker("Mietek", "Król"),
                new Worker("Zygmunt", "Zając"));

        Random lottery = new Random();
        for (int i = 1; i <=12; i++){
            int luckyNumber = lottery.nextInt(workers.size());
            System.out.println("Szczęśliwy numerek to: " +luckyNumber);
        }


        System.out.println();
    }
}
