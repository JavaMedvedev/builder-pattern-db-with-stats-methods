package DB;

import java.time.LocalDate;

public class EmployeeBuilder {
    private int id;
    private String firstName;
    private String secondName;
    private Employee.Gender gender;
    private String jobTitle;
    private Employee.Department department;
    private LocalDate dateOfEmployment;
    private LocalDate dateOfDeparture;
    private double yearSalary;
    private Boolean fullTime = true;
    private Characteristics characteristics;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public EmployeeBuilder setGender(Employee.Gender gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public EmployeeBuilder setDepartment(Employee.Department department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
        return this;
    }

    public EmployeeBuilder setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
        return this;
    }

    public EmployeeBuilder setYearSalary(double yearSalary) {
        this.yearSalary = yearSalary;
        return this;
    }

    public EmployeeBuilder setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
        return this;
    }

    public EmployeeBuilder setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
        return this;
    }


    public Employee createEmployee() {
        return new Employee(id, firstName, secondName, gender, jobTitle, department, dateOfEmployment, dateOfDeparture, yearSalary, fullTime, characteristics);
    }

}