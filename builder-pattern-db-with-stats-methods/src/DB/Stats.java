package DB;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stats {

    public static List<Employee> allEmployees (List<Employee> list) {
        return list;
    }

    public static double totalSalary (List<Employee> list) {
        double totalSalary = list.stream()
                .parallel()
                .mapToDouble(Employee::getYearSalary)
                .sum();
        return totalSalary;
    }

    public static double avgSalary(List<Employee> list) {
        double avgSalary = 0;
        for(int i = 0; i < list.size(); i++) {
            avgSalary += list.get(i).getYearSalary();
        }
        avgSalary /= list.size();
        return avgSalary;
    }

    public static OptionalDouble maxSalary(List<Employee> list) {
        OptionalDouble maxSalary = list.stream()
                .mapToDouble(Employee::getYearSalary)
                .max();
        return maxSalary;
    }

    public static List<Employee> lowSalaryEmployees(List<Employee> list) {
        List<Employee> lowSalaryEmployees = list.stream()
                .filter(e -> e.getYearSalary() < 70000)
                .collect(Collectors.toList());
        return lowSalaryEmployees;
    }

    public static List<String> empSecondNamesWithHighSalarySortedBySecondName (List<Employee> list) {
        List<String> empSorted = list.stream()
                .filter(e -> e.getYearSalary() >= 70000)
                .map(Employee::getSecondName)
                .sorted()
                .collect(Collectors.toList());
        return empSorted;
    }

    public static double salaryPerCentFromAvg(List<Employee> list, double salary) {
        double salaryRelationToAvg;
        salaryRelationToAvg = Math.round((salary * 100 / Stats.avgSalary(list))*100)/100;
        return salaryRelationToAvg;
    }

    public static List<Double> empDistinctHeight(List<Employee> list) {
        List<Double> empDistinctHeight = list.stream()
                .map(Employee::getCharacteristics)
                .map(Characteristics::getHeight)
                .distinct()
                .collect(Collectors.toList());
        return empDistinctHeight;
    }

    public static boolean ifAllMales(List<Employee> list) {
        boolean allMales;
        allMales = list.stream()
                .allMatch(employee -> employee.gender.equals(Employee.Gender.MALE));
        return  allMales;
    }

    public static List<Employee.Gender> allGendersList(List<Employee> list) {
        List<Employee.Gender> allGenders = list.stream()
                .map(Employee::getGender)
                .distinct()
                .collect(Collectors.toList());
        return allGenders;
    }

}
