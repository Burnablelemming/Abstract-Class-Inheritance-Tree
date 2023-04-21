/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S545586
 */
public class StudentEmployee extends Employee {

    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;

    public StudentEmployee(String employeeName, int employeeId, boolean isWorking, int hoursWorked, boolean isWorkStudy, double payRate) {
        super(employeeName, employeeId, isWorking);
        this.payRate = payRate;
        this.isWorkStudy = isWorkStudy;
        this.hoursWorked = hoursWorked;
    }

    public String toString() {
        return "studentEmployee";
    }

    public double getPayRate() {
        return this.payRate;
    }

    @Override
    public double getPay() {
        return hoursWorked * payRate;
    }
}
