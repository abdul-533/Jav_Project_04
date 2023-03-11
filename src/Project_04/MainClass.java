package Project_04;


import Project_04.Models.Employees.Employee;
import Project_04.Database.Employees;

import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        // Don't be fooled by the length of the code here, because 80% of it is there so that it looks visually beautiful...
        // You don't need to change anything, I'll leave the codes here as finished.


        // I used 2 Scanners because a scanner used for String can give an error when used for another type.
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);


        // Simple program start, if Step 4 is selected, the loop will stop.

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Welcome to the Company Panel. Please select a name.");
            System.out.println("------------------------------------");
            System.out.println("1-Employee Operations\n2-View All Employees\n3-View All Employees in the Department\n4-Exit");
            System.out.println("------------------------------------");
            System.out.print("Process :");
            int choice1 = input.nextInt();
            System.out.println("Your transaction is being processed, please wait...");
            Thread.sleep(1500);

            // If the selection is 1, it will go to the Employee Processes tab.
            if (choice1 == 1) {
                while (true) {
                    System.out.println("---------------------------------");
                    System.out.println("Welcome to Employee Transactions Panel, Please select a transaction.");
                    System.out.println("1-Add Employee\n2-Delete Employee\n3-Make Raise\n4-Previous Menu\n");
                    System.out.print("Process :");
                    int choice2 = input.nextInt();
                    System.out.println("Your transaction is being processed, please wait...\n");
                    Thread.sleep(1000);

                    // A worker will be added for selection 1, it will ask you for the necessary arguments for the parameter of the constructor
                    if (choice2 == 1) {

                        System.out.print("Please enter your name and surname:");
                        String employeeNameSurname = stringInput.nextLine();


                        System.out.print("Please enter salary: ");
                        int employeeSalary = input.nextInt();


                        System.out.print("Please enter the department code: ");
                        String employeeDepartmentCode = stringInput.nextLine();

                        // Employee's constructor and arguments are used here.

                        new Employee(employeeNameSurname, employeeSalary, employeeDepartmentCode);
                        System.out.println("Added with success. You are being transferred to the previous menu...");
                        Thread.sleep(1000);
                        break;
                    } else if (choice2 == 2) {

                        // An id will be given and necessary actions will be taken on the id, the process here
                        // to delete an employee

                        System.out.print("Please enter the ID of the employee you want to delete:");
                        String employeeID = stringInput.nextLine();
                        Employees.deleteEmployeeWithId(employeeID);
                        System.out.println(employeeID + " Successfully deleted. You are being transferred to the Previous Menu....");
                        Thread.sleep(1000);
                        break;
                    } else if (choice2 == 3) {

                        // An id will be given and necessary actions will be taken on the id, the process here
                        // to raise an employee
                        System.out.print("Please enter the ID of the employee you want to raise: ");
                        String employeeId = stringInput.nextLine();
                        Employee.makeRaise(employeeId);
                        System.out.println("The operation was successful, you are being transferred to the previous menu.");
                        Thread.sleep(1000);
                        break;
                    } else if (choice2== 4) {
                        System.out.println("Your transaction is being processed, please wait...\n");
                        Thread.sleep(1000);
                        break;
                    } else {
                        System.out.println("You made the wrong choice, please try again.");
                    }
                }

                // If selection 2 is made, Employees will be listed

            } else if (choice1 == 2) {
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("-------------------------");
                Employees.printEmployees();
                System.out.println("-------------------------");

                // If selection 3 is made, a department code will be requested and all people working in that department will be sent to the console.
                // will be printed.
            } else if (choice1 == 3) {
                System.out.print("Please enter the department code:");
                String departmanKodu = stringInput.nextLine();
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("All employees are listed...");
                Thread.sleep(1000);
                System.out.println("-------------------------");
                Employees.printEmployeesintheDepartment(departmanKodu);
                System.out.println("-------------------------");
            } else {
                System.out.print("You have successfully logged out, have a nice day.");
                break;
            }

        }

    }

}
