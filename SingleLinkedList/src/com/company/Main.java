package com.company;

public class Main {

    public static void main(String[] args) {
	Employee JamesJones =  new Employee("James","Jones",123);
	Employee MichaelJordan= new Employee("Michael","Jordan",23);
	Employee KobeBryant= new  Employee("Kobe","Bryant",24);
	Employee PaulGasol = new Employee("Paul","Gasol",16);
	EmployeeLinkedList list = new EmployeeLinkedList();
	list.addToFront(JamesJones);
	list.addToFront(MichaelJordan);
	list.addToFront(KobeBryant);
	list.addToFront(PaulGasol);
	list.printList();
	System.out.println(list.getSize());
	list.removeFromFront();
	list.removeFromFront();
	System.out.println(list.getSize());
	list.printList();

    }
}
