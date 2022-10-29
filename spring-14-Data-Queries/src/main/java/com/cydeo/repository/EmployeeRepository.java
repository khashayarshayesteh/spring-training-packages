package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Display all employees with email address

    List<Employee> findTopByEmail(String email);

    // Display all employees with firstname "" and lastname "" , also show all employees with an email address ""

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname,String lastname,String email);

    // Display all employees that firstname is not ""   this is drive quary
    List<Employee> findByFirstNameIsNot(String firstname);

    //  Display all employees where last name start with ""
    List<Employee> findByLastNameIsStartingWith(String lastName);

    // Display all employees salaries higher than ""

    List<Employee> findBySalaryGreaterThan(Integer salary);


    // Display all employees salaries less than ""

    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between "" and ""

    List<Employee>  findByHireDateBetween(LocalDate start, LocalDate end);

    // Display all employees are greater and equal to "" in order - salary

    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top uniqe 3 employees that is making less than ""

    List<Employee >  findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email addrerss

    List<Employee> findByEmailIsNull();

    // JPQL
    @Query("Select employee  FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email='amcnee1@google.es'")
   // Employee retrieveEmployeeSalary();

    Integer retrieveEmployeeSalary();

    //Not Equal
    @Query("SELECT e FROM Employee  e WHERE e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like / Contains / Startswiths / Endswith

    List<Employee> re











}
