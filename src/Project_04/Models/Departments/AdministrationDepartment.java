package Project_04.Models.Departments;

public class AdministrationDepartment implements Department {

    final String departmentCode= "AD";


    final int raiseRate = 30;


    @Override
    public int getraiseRate() {
        return raiseRate;
    }

    @Override
    public String getdepartmentCode() {
        return departmentCode;
    }
}
