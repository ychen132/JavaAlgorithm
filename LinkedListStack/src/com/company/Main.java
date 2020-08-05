package com.company;

import java.util.PropertyPermission;

public class Main {

    public static void main(String[] args) {
        Employee JamesJones =  new Employee("James","Jones",123);
        Employee MichaelJordan= new Employee("Michael","Jordan",23);
        Employee KobeBryant= new  Employee("Kobe","Bryant",24);
        Employee PaulGasol = new Employee("Paul","Gasol",16);
        StackLinked stack =new StackLinked();
        stack.push(JamesJones);
        stack.push(MichaelJordan);
        stack.push(KobeBryant);
        stack.push(PaulGasol);
        stack.printStack();
        System.out.println("Popped +" + stack.pop());
        stack.printStack();
    }
}
