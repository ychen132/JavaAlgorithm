package com.company;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;



    public void addToFront(Employee employee){

        EmployeeNode Node = new EmployeeNode(employee);

        if(head==null){
            tail=Node;
        }else{
            head.setPrevious(Node);
            Node.setNext(head);
        }

        head = Node;
        size++;
    }
    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (tail==null){
            head=node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;
    }
    public  EmployeeNode removeFromFront(){
        if(isEmpty()==true){
            return null;
        }
        else{
            EmployeeNode removed = head;
            if(head.getNext()==null){
                tail = null;
            }
            else{
                head.getNext().setPrevious(null);
            }
            head=head.getNext();
            size--;
            return removed;

        }
    }
    public EmployeeNode removeFromEnd(){
        if(tail==null){
            return null;
        }
        EmployeeNode removeNodeEnd = tail;
        if (tail.getPrevious()==null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        size--;
        return removeNodeEnd;
    }
    public void printList(){
        EmployeeNode Current = head;
        System.out.println("Head ->");
        while(Current!=null){
            System.out.println(Current);
            System.out.print("<=>");
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
