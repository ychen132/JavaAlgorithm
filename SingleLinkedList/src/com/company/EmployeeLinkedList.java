package com.company;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
    public void addToFront(Employee employee){
        EmployeeNode Node = new EmployeeNode(employee);
        Node.setNext(head);
        head = Node;
        size++;
    }
    public  EmployeeNode removeFromFront(){
        if(isEmpty()==true){
            return null;
        }
        else{
            EmployeeNode removed = head;
            head=head.getNext();
            size--;
            return removed;

        }
    }
    public void printList(){
        EmployeeNode Current = head;
        System.out.println("Head ->");
        while(Current!=null){
            System.out.println(Current);
            System.out.print("->");
            Current=Current.getNext();
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head ==null;
    }

}
