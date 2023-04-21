/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.*;
import java.io.*;

/**
 *
 * @author dianar
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String line;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students in the file: ");
        int numStudents = input.nextInt();
        System.out.println("Enter the number of staff in the file: ");
        int numStaff = input.nextInt();
        System.out.println("Enter the number of faculty in the file: ");
        int numFaculty = input.nextInt();
        System.out.println("Enter the name of the file: ");
        String fileName = input.next();

        File fileInput = new File(fileName);
        Scanner file = new Scanner(fileInput);

        //Making one arraylist to store all the data.
        Employee[] workers = new Employee[numStudents + numStaff + numFaculty];
        //Using loop to go through everyline in the fileName.
        while (file.hasNextLine()) {
            line = file.nextLine();
            String[] a = line.split(",");
            if (index < numStudents) {
                workers[index] = new StudentEmployee(a[0], Integer.parseInt(a[1]), Boolean.parseBoolean(a[2]), Integer.parseInt(a[3]), Boolean.parseBoolean(a[4]), Double.parseDouble(a[5]));

            } else if (index < numStudents + numStaff) {
                workers[index] = new ClassifiedStaff(a[0], Integer.parseInt(a[1]), Boolean.parseBoolean(a[2]), Double.parseDouble(a[3]), a[4]);

            } else if (index < numStudents + numStaff + numFaculty) {
                workers[index] = new Faculty(a[0], Integer.parseInt(a[1]), Boolean.parseBoolean(a[2]), Double.parseDouble(a[3]), Integer.parseInt(a[4]), a[5]);

            }
            index++;
        }
        System.out.println("");
        for (Employee worker : workers) {
            System.out.println(worker);
        }
        System.out.println("");
        System.out.println("Pay for two-week pay period");
        System.out.println("===========================");
        for (Employee worker : workers) {
            if (worker.isWorking()) {
                System.out.printf("%s\t%.2f%n", worker.getEmployeeName(), worker.getPay());
            }
        }
    }

}
