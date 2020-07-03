package DB;

import java.time.LocalDate;

public class EmployeeDB {

    public static Employee emp1 = new EmployeeBuilder()
            .setId(101)
            .setFirstName("Charlotte")
            .setSecondName("Eyre")
            .setGender(Employee.Gender.FEMALE)
            .setJobTitle("Engineer")
            .setDepartment(Employee.Department.ENGINEERING)
            .setDateOfEmployment(LocalDate.of(2020, 10, 10))
            .setYearSalary(99000.00)
            .setCharacteristics(new Characteristics(5.7, 147.0, Characteristics.Diet.NOT_SPECIFIED))
            .createEmployee();

    public static Employee emp2 = new EmployeeBuilder()
            .setId(102)
            .setFirstName("Jerome David")
            .setSecondName("Caulfield")
            .setGender(Employee.Gender.MALE)
            .setJobTitle("Accountant")
            .setDepartment(Employee.Department.FINANCE)
            .setDateOfEmployment(LocalDate.of(2019, 04, 14))
            .setYearSalary(67000.50)
            .setCharacteristics(new Characteristics(6.2, 181.4, Characteristics.Diet.NOT_SPECIFIED))
            .createEmployee();

    public static Employee emp3 = new EmployeeBuilder()
            .setId(103)
            .setFirstName("Virginia")
            .setSecondName("Dalloway")
            .setGender(Employee.Gender.FEMALE)
            .setJobTitle("Florist")
            .setDepartment(Employee.Department.HR)
            .setDateOfEmployment(LocalDate.of(2020, 01, 03))
            .setYearSalary(73000.00)
            .setCharacteristics(new Characteristics(5.3, 130.0, Characteristics.Diet.VEGETARIAN))
            .createEmployee();

    public static Employee emp4 = new EmployeeBuilder()
            .setId(104)
            .setFirstName("Ayn")
            .setSecondName("Taggart")
            .setGender(Employee.Gender.FEMALE)
            .setJobTitle("Engineer")
            .setDepartment(Employee.Department.MAINTENANCE)
            .setDateOfEmployment(LocalDate.of(2018, 12, 20))
            .setYearSalary(69700.00)
            .setCharacteristics(new Characteristics(5.7, 142.0, Characteristics.Diet.NOT_SPECIFIED))
            .createEmployee();

    public static Employee emp5 = new EmployeeBuilder()
            .setId(105)
            .setFirstName("Charles")
            .setSecondName("Twist")
            .setGender(Employee.Gender.MALE)
            .setJobTitle("Accountant")
            .setDepartment(Employee.Department.FINANCE)
            .setDateOfEmployment(LocalDate.of(2019, 05, 30))
            .setYearSalary(55000.00)
            .setCharacteristics(new Characteristics(6.0, 155.7, Characteristics.Diet.VEGETARIAN))
            .createEmployee();

    public static Employee emp6 = new EmployeeBuilder()
            .setId(106)
            .setFirstName("Oscar")
            .setSecondName("Gray")
            .setGender(Employee.Gender.MALE)
            .setJobTitle("Attorney")
            .setDepartment(Employee.Department.LEGAL)
            .setDateOfEmployment(LocalDate.of(2017, 10, 01))
            .setYearSalary(120000.00)
            .setCharacteristics(new Characteristics(5.8, 148.0, Characteristics.Diet.NOT_SPECIFIED))
            .createEmployee();

}
