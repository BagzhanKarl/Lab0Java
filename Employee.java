package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i, String firstNam, String lastNam, int salar){
        id = i;
        firstName = firstNam;
        lastName = lastNam;
        salary = salar;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary1){
        salary = salary1;
    }

    public int getAnnualSalary(){
        return  salary * 12;
    }
    public int raiseSalary(int persent){
        int newSalary, test;
        newSalary = (salary * persent) / 100;

        test = salary + newSalary;
        salary = test;
        return test;
    }

    public String Print(){
        return "Employee[id=" + id + ",name= " + firstName + " " + lastName + ",salary="+ salary + "]";
    }

}
