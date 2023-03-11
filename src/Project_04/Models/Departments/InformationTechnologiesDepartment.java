package Project_04.Models.Departments;

public class InformationTechnologiesDepartment implements Department {

    final String departmentCode = "ITD";


    final int raiserate = 25;


    @Override
    public int getraiseRate() {
        return raiserate;
    }

    @Override
    public String getdepartmentCode() {
        return departmentCode;
    }
}
