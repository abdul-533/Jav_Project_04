package Project_04.Database;



import Project_04.Models.Departments.InformationTechnologiesDepartment;
import Project_04.Models.Departments.Department;
import Project_04.Models.Departments.HumanResourcesDepartment;
import Project_04.Models.Departments.AdministrationDepartment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departments {


    // Bunu bir veritabani gibi düsünmeliyiz bu yüzden proje calistiği zaman, ilk once veritabani olusmali ki
    // ekleme cikarma islemlerini rahatca yapabilelim bu yüzden tüm değerleri static verip, departmanList i ise
    // new leyip, bu departmanlari içerisine bulunduralim.
    static private final Department INFORMATION_TECHNOLOGIES_DEPARTMENT = new InformationTechnologiesDepartment();
    static private final Department ADMINISTRATION_DEPARTMENT = new AdministrationDepartment();
    static private final Department HUMAN_RESOURCES_DEPARTMENT = new HumanResourcesDepartment();
    static private List<Department> DepartmentList = new ArrayList<>(Arrays.asList(INFORMATION_TECHNOLOGIES_DEPARTMENT, ADMINISTRATION_DEPARTMENT, HUMAN_RESOURCES_DEPARTMENT));

    // Basit bir getter method
    public static List<Department> getDepartmentList() {
        return DepartmentList;
    }


}
