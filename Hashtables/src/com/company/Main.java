package com.company;

public class Main {

    public static void main(String[] args) {
        Employee JamesJones =  new Employee("James","Jones",123);
        Employee MichaelJordan= new Employee("Michael","Jordan",23);
        Employee KobeBryant= new  Employee("Kobe","Bryant",24);
        Employee PaulGasol = new Employee("Paul","Gasol",16);
        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones",JamesJones);
        ht.put("Michael",MichaelJordan);
        ht.put("kobe", KobeBryant);
        ht.put("Paul",PaulGasol);

        ht.printHashtable();

        System.out.println(ht.get("kobe"));
        System.out.println(ht.get("Paul"));

        ht.remove("Michael");
        ht.remove("Jones");
        ht.printHashtable();
    }
}
