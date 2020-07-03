package DB;

import java.util.List;

import static DB.EmployeeDB.emp1;

public class Application {

    public static void main(String[] args) {

        List<Employee> list = EmployeeListBuilder.employeeListBuilder();

        Stats.allEmployees(list);
        Stats.totalSalary(list);
        Stats.avgSalary(list);
        Stats.maxSalary(list);
        Stats.lowSalaryEmployees(list);
        Stats.empSecondNamesWithHighSalarySortedBySecondName(list);
        Stats.empDistinctHeight(list);
        Stats.salaryPerCentFromAvg(list, emp1.getYearSalary());
        Stats.ifAllMales(list);
        Stats.allGendersList(list);

    }

}




