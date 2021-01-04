package ru.rmanokhin.spring.mvc.employee;



import ru.rmanokhin.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Minimum name > 2")
    private String name;
    @NotBlank(message = "is blank")
    private String surname;
    @Min(value = 500, message = "Salary need > 500")
    @Max(value = 1000, message = "Salary need < 1000")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String car;
    private Map<String, String> cars;
    private String[] language;
    private Map<String, String> languages;
    @Pattern(regexp = "\\d-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern X-XXX-XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "Email must ends with abc.com")
//    @CheckEmail
    private String email;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT" ,"Information Technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");

        cars = new HashMap<>();
        cars.put("BMV", "BMV");
        cars.put("MERCEDES-BENZ", "MB");
        cars.put("AUDI", "AUDI");

        languages = new HashMap<>();
        languages.put("English", "EN");
        languages.put("Spanish", "SP");
        languages.put("Russian", "RU");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
