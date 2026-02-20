//package com.example.Test.EmployeeTest;
//
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//public class Testclass {
//
//
//        @Test
//        public void testProgrammerSalaryIncrease() {
//            Employee emp = new Employee(101, "Ravi", 10000, "programmer",30);
//            double newSalary = emp.calcSalary();
//
//            // 10% increase, no leave deduction
//            assertEquals(11000.0, newSalary);
//        }
//
//        @Test
//        public void testDesignerSalaryIncrease() {
//            Employee emp = new Employee(102, "Sita", 10000, "designer", 30);
//            double newSalary = emp.calcSalary();
//
//            // 20% increase
//            assertEquals(12000.0, newSalary);
//        }
//
//        @Test
//        public void testLeaveDeduction() {
//            Employee emp = new Employee(103, "Amit",10000, "programmer", 39);
//            double newSalary = emp.calcSalary();
//
//
//            assertEquals(7500.0, newSalary);
//        }
//
//
//    }
//
//
