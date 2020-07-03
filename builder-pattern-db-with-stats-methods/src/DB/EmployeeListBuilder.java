package DB;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListBuilder {

    public static List<Employee> employeeListBuilder() {

        List<Employee> list = new ArrayList<>();
        list.add(EmployeeDB.emp1);
        list.add(EmployeeDB.emp2);
        list.add(EmployeeDB.emp3);
        list.add(EmployeeDB.emp4);
        list.add(EmployeeDB.emp5);
        list.add(EmployeeDB.emp6);

        return list;
    }

}
