package Project_04.Database;

import Project_04.Models.Employees.Employee;
import Project_04.Models.Departments.Department;

import java.util.ArrayList;

public class Employees {


    // List running here is static because it should be created as soon as the project starts running. We can view it as a database
    //  All of our employees will be included in this list.
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    // A simple getter method to get employees
    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    // Required method to add an employee.
    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
    }


    // Required method to delete an employee.
    public static void deleteEmployeeWithId(String employeeId) {
        for (Employee c : employeeList) {
            if (c.getEmployeeId().equals(employeeId))
                employeeList.remove(c);
        }
        // employeeList.removeIf(c -> c.getCalisanId().equals(workId));
    }

    // By giving the department code, to print only the employees working in that department to the console
    public static void printEmployeesintheDepartment(String departmentCode) {
        for (Department d : Departments.getDepartmentList()) {

            if (departmentCode.equals(d.getdepartmentCode())) {
                String b = d.getdepartmentCode();
                {
                    for (Employee c : employeeList) {
                        if (c.getDepartment().getdepartmentCode().equals(b)) {
                            System.out.println(c);
                        }

                    }
                }
            }
        }
    }

    // To print the employees to the console
    public static void printEmployees() {
        for (Employee s : employeeList)
            System.out.println(s);
    }


}
