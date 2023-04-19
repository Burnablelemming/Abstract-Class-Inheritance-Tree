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
    private boolean isWorking;
    private double payRate;

    public StudentEmployee(String employeeName, int employeeId, int hoursWorked, boolean isWorking, double payrate) {
        super(employeeName, employeeId, isWorking);
        this.payRate = payRate;
    }

    public String toString() {
        return "test";
    }

    public double getPay() {
        return hoursWorked * payRate;
    }
}
