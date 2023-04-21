/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S545586
 */
public class Faculty extends Employee {

    private double annualSalary;
    private int weeksPerYear;
    private String department;

    public Faculty(String employeeName, int employeeId, boolean isWorking, double annualSalary, int weeksPerYear, String department) {
        super(employeeName, employeeId, isWorking);
        this.annualSalary = annualSalary;
        this.weeksPerYear = weeksPerYear;
        this.department = department;
    }

    public String toString() {
        return String.format("%-15s%15d%10b%14.2f%4d%20s", super.getEmployeeName(), super.getEmployeeId(), super.isWorking(), annualSalary, weeksPerYear, department);
    }

    public double getPay() {
        return annualSalary * 2 / weeksPerYear;
    }
}
