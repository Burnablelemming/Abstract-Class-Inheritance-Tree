/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S545586
 */
public class ClassifiedStaff extends Employee {

    private double weeklySalary;
    private String division;

    public ClassifiedStaff(String employeeName, int employeeId, boolean isWorking, double weeklySalary, String division) {
        super(employeeName, employeeId, isWorking);
        this.weeklySalary = weeklySalary;
        this.division = division;
    }

    public String toString() {
        return "classifiedstaff";
    }

    public double getPay() {
        return weeklySalary * 2;
    }
}
