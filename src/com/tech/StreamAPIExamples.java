package com.tech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIExamples {

    public static void main(String[] args) {
        List<Employee> employees = buildEmployeesList();

        //Stream.forEach() - Prints the employees list
        employees.forEach(System.out::println);

        //Stream.filter() - Get the employees with more than 5 years of experience
        employees.stream().filter(employee -> employee.getExperienceYears() > 5).forEach(System.out::println);

        //Stream.map() - Get only the employees positions as upper case
        employees.stream().map(Employee::getPosition).map(String::toUpperCase).forEach(System.out::println);

        //Stream.collect() - Store the employees names in a separate collection
        List<String> namesInUppercase = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.print(namesInUppercase);

        //Stream.anyMatch() - Check if we have at least one DevOps in our employees list
        boolean matchedResult1 = employees.stream().anyMatch(employee -> employee.getPosition().equals("DevOps"));
        System.out.println(matchedResult1);

        //Stream.allMatch() - Check that all the employees have age greater than 21
        boolean matchedResult2 = employees.stream().allMatch(employee -> employee.getAge() > 21);
        System.out.println(matchedResult2);

        //Stream.noneMatch() - Check that we do not have an under-age employee
        boolean matchedResult3 = employees.stream().noneMatch(employee -> employee.getAge() < 21);
        System.out.println(matchedResult3);

        //Stream.count() - Get how many employees we have with more than 10 years of experience
        long employeesNumber = employees.stream().filter(employee -> employee.getExperienceYears() > 10).count();
        System.out.println(employeesNumber);

        //Stream.max() - Get the older employee
        Optional<Employee> olderEmployee = employees.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(olderEmployee.get());

        //Stream.min() - Get the younger employee
        Optional<Employee> youngerEmployee = employees.stream().min(Comparator.comparing(Employee::getAge));
        System.out.println(youngerEmployee.get());

        //Stream.sorted() - Sorts the list of employees by age
        employees.stream().map(Employee::getAge).sorted().forEach(System.out::println);

        //Stream.limit() - Get only the first 3 employees with experience greater than 8
        employees.stream().filter(employee -> employee.getExperienceYears() > 8).limit(3).forEach(System.out::println);
    }

    private static List<Employee> buildEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Juan Diaz", "Av Lopez Mateos 100", 27, "Software Engineer", 5);
        employees.add(employee1);
        Employee employee2 = new Employee("Pedro Alvarez", "Av Patria 1200", 32, "Senior Software Engineer", 8);
        employees.add(employee2);
        Employee employee3 = new Employee("Carlos Contreras", "Av 8 de julio 900", 40, "Project Manager", 15);
        employees.add(employee3);
        Employee employee4 = new Employee("Angel Pantoja", "Av Juarez 400", 23, "Software Intern", 0);
        employees.add(employee4);
        Employee employee5 = new Employee("Karla Perez", "Arroyo seco 100", 35, "DevOps", 12);
        employees.add(employee5);
        Employee employee6 = new Employee("Alex Gutierrez", "Av Independencia 3030", 29, "Service Desk Technician", 6);
        employees.add(employee6);
        Employee employee7 = new Employee("Manuel Robledo", "Av Enrique Diaz Leon", 50, "Software Architect", 18);
        employees.add(employee7);
        Employee employee8 = new Employee("Diana Avalos", "Av Centro 2910", 46, "SDET", 10);
        employees.add(employee8);
        return employees;
    }
}
