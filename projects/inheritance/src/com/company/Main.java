package com.company;

import sun.util.resources.cldr.so.CurrencyNames_so;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.BestEmployee();

    }
}
