package Project_04.Models.Departments;

public class HumanResourcesDepartment implements Department {

    final String departmentCode = "HRD";

    //
    final int rsiserate = 20;


    @Override
    public int getraiseRate() {
        return rsiserate;
    }

    @Override
    public String getdepartmentCode() {
        return departmentCode;
    }
}
