package com.company;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode Next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return Next;
    }

    public void setNext(EmployeeNode next) {
        Next = next;
    }
    public String toString(){
        return employee.toString();
    }
}
