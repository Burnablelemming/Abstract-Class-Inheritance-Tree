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
        return "faculty";
    }

    public double getPay() {
        return annualSalary * 2 / weeksPerYear;
    }
}
