package com.company;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee JamesJones =  new Employee("James","Jones",123);
        Employee MichaelJordan= new Employee("Michael","Jordan",23);
        Employee KobeBryant= new  Employee("Kobe","Bryant",24);
        Employee PaulGasol = new Employee("Paul","Gasol",16);
        Map<String,Employee> hashmap = new HashMap<String,Employee>();
        hashmap.put("Jones",JamesJones);
        hashmap.put("Jordan",MichaelJordan);
        hashmap.put("Bryant",KobeBryant);
//        Iterator<Employee> iterator = hashmap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(hashmap.get("Jordan"));
        System.out.println(hashmap.getOrDefault("Sb",JamesJones));

        hashmap.forEach((k,v)->System.out.println("Key = " + k+ ", Employee = "+ v));
    }
}
