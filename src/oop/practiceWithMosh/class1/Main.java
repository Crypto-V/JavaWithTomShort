package oop.practiceWithMosh.class1;

public class Main {
    public static void main(String[] args) {
        new Employee(10_000);
        System.out.println(Employee.numOfEmployees);
        var employee = new Employee(50_000,10);
        int wage  = employee.calculateWage(0);
        System.out.println(wage);
    }
}


