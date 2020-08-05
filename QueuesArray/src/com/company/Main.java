package com.company;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Employee JamesJones = new Employee("James", "Jones", 123);
        Employee MichaelJordan = new Employee("Michael", "Jordan", 23);
        Employee KobeBryant = new Employee("Kobe", "Bryant", 24);
        Employee PaulGasol = new Employee("Paul", "Gasol", 16);
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(JamesJones);
        queue.add(MichaelJordan);
        queue.add(KobeBryant);
        queue.add(PaulGasol);
        queue.printQueue();
        queue.peek();
        queue.remove();
        queue.remove();
        queue.printQueue();
    }
}