package com.company;

import java.util.Objects;

public class Employee {
    private String FirstName;
    private String LastName;
    private int Id;

    public Employee(String firstName, String lastName, int id) {
        FirstName = firstName;
        LastName = lastName;
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Id == employee.Id &&
                Objects.equals(FirstName, employee.FirstName) &&
                Objects.equals(LastName, employee.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, Id);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Id=" + Id +
                '}';
    }
}
