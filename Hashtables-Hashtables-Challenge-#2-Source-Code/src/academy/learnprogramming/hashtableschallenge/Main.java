package academy.learnprogramming.hashtableschallenge;



import java.util.*;
import java.util.zip.CheckedInputStream;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
       // employees=CheckList(employees);
        employees.forEach(e -> System.out.println(e));

        HashMap<Integer,Employee> employeeHashMap = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employeeHashMap.containsKey(employee.getId())){
                remove.add(employee);
            }
            else{
                employeeHashMap.put(employee.getId(),employee);
            }
        }
            for(Employee employee:remove){
                employees.remove(employee);
            }
        System.out.println("------------------");
        employees.forEach(e -> System.out.println(e));

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }
    public static LinkedList<Employee> CheckList(LinkedList<Employee> employees){
        Map<Integer,Employee> HashMap = new HashMap<Integer,Employee>();
        for(int i =0; i < employees.size(); i++){
             HashMap.put(employees.get(i).getId(),employees.get(i));
        }
        LinkedList<Employee> newList = new LinkedList<Employee>();
        HashMap.forEach((k,v)->newList.add(v));
        return newList;
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
