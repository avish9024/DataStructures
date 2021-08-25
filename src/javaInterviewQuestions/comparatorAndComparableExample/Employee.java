package javaInterviewQuestions.comparatorAndComparableExample;

public class Employee implements Comparable<Employee>{
    String name;
    int id;
    String address;
    String department;
    int salary;

    public Employee(String name, int id, String address, String department, int salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Overridden method compareTo method of Comparable Interface
    @Override
    public int compareTo(Employee o) {
        if (o.getSalary() == this.salary)
            return 0;
        else if (o.getSalary() > this.salary)
            return 1;
        return -1;
    }
}
