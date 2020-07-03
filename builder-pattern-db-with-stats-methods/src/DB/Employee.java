package DB;

import java.time.LocalDate;

public class Employee {

    int id;
    String firstName;
    String secondName;
    Gender gender;
    String jobTitle;
    Department department;
    LocalDate dateOfEmployment;
    LocalDate dateOfDeparture;
    double yearSalary;
    Boolean fullTime = true;
    Characteristics characteristics;


    public Employee(int id, String firstName, String secondName, Gender gender, String jobTitle, Department department, LocalDate dateOfEmployment, LocalDate dateOfDeparture, Double yearSalary, Boolean fullTime, Characteristics characteristics) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.department = department;
        this.dateOfEmployment = dateOfEmployment;
        this.dateOfDeparture = dateOfDeparture;
        this.yearSalary = yearSalary;
        this.fullTime = fullTime;
        this.characteristics = characteristics;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", department=" + department +
                ", dateOfEmployment=" + dateOfEmployment +
                ", dateOfDeparture=" + dateOfDeparture +
                ", yearSalary=" + yearSalary +
                ", fullTime=" + fullTime +
                ", characteristics=" + characteristics +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public double getYearSalary() {
        return yearSalary;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    enum Gender {
        MALE, FEMALE
    }

    enum Department {
        ENGINEERING, FINANCE, MAINTENANCE, LEGAL, HR
    }

}




