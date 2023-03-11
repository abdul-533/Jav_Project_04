package Project_04.Models.Employees;

import Project_04.Models.Departments.Department;
import Project_04.Database.Employees;
import Project_04.Database.Departments;

public class Employee {

    private String employeeId;
    private String nameSurname;
    private int salary;
    private Department Department;
    private String nameCode = "";

    public Employee(String nameSurname, int salary, String departmentCode) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        setDepartment(departmentCode);
        this.setEmployeeId();
        Employees.addEmployee(this);
    }

    // According to the user's department code, the required department should be set.
    private void setDepartment(String departmentCode) {
        for (Department g : Departments.getDepartmentList()) {
            if (g.getdepartmentCode().equals(departmentCode))
                this.Department = g;
        }

    }

    // We mentioned that the ID of the employee is unique to him.
    // is contained in.

    private void setEmployeeId() {
        this.employeeId = this.Department.getdepartmentCode() + (Employees.getEmployeeList().size() + 1) + getEmployeeNAmeCode();


    }

    // A method that splits the name to add a name code to the end of the employee's ID.
    private String getEmployeeNAmeCode() {
        //   char firstL= nameSurname.charAt(0);
        //   int bI = nameSurname.indexOf(" ");
        //   char firstL2 = nameSurname.charAt(bI + 1);
        //   int bI2 = nameSurname.indexOf(" ", bI + 1);
        //  // char firstL3 = nameSurname.charAt(bI2 + 1);
        //   String FirstLetters = String.valueOf(firtsL) + String.valueOf(firstL2);
        nameCode = String.valueOf(nameSurname.charAt(0));
        for (int i = 0; i < nameSurname.length(); i++) {
            if (nameSurname.charAt(i) == ' ')
                nameCode = nameCode.concat(String.valueOf(nameSurname.charAt(i + 1)));

        }


        return nameCode;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }


    public Department getDepartment() {
        return this.Department;
    }


    public String getDepartmentName() {
        String departmentName = null;
        if (getDepartment().getdepartmentCode().equals("YD"))
            departmentName = "Administration Department";
        else if (getDepartment().getdepartmentCode().equals("ITD"))
            departmentName = "Information Technologies Department";
        else if (getDepartment().getdepartmentCode().equals("ITD"))
            departmentName = "Human resources department";




        return departmentName;
    }


    public static void makeRaise(String employeeId) {

        for (Employee c : Employees.getEmployeeList())
            if (c.employeeId.equals(employeeId)) {
                c.salary= c.salary + (c.Department.getraiseRate() * c.salary) / 100;
            }

        //salary=raise+salary;
        // raise=department.x.rate of raise


    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", salary=" + salary +
                ", Department=" + Department.getClass().getSimpleName() +
                '}';
    }

}

