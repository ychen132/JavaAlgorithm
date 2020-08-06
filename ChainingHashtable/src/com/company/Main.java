package com.company;

public class Main {

    public static void main(String[] args) {
        Employee JamesJones =  new Employee("James","Jones",123);
        Employee MichaelJordan= new Employee("Michael","Jordan",23);
        Employee KobeBryant= new  Employee("Kobe","Bryant",24);
        Employee PaulGasol = new Employee("Paul","Gasol",16);
        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones",JamesJones);
        ht.put("Michael",MichaelJordan);
        ht.put("kobe", KobeBryant);
        ht.put("Paul",PaulGasol);

        ht.printHashtable();

        System.out.println(ht.get("kobe"));
        System.out.println(ht.get("Paul"));

        ht.Remove("Michael");
        ht.Remove("Jones");
        ht.printHashtable();
    }
}
