package javaInterviewQuestions.comparatorAndComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Avinash1", 1, "Bangalore", "Engg",20000);
        Employee e2 = new Employee("Avinash2", 2, "Bangalore", "Engg",30000);
        Employee e3 = new Employee("Avinash3", 3, "Bangalore", "Engg",10000);
        Employee e4 = new Employee("Avinash4", 4, "Bangalore", "Engg",40000);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);
    }
}
