package employee;

import java.time.LocalDate;

public class Employee {
    private double salary;
    private String fullname;
    private String salaryDate;

    public Employee(double salary, String fullname, String salaryDate) {
        this.salary = salary;
        this.fullname = fullname;
        this.salaryDate = salaryDate;
    }

    public Employee(double salary, String fullname) {
        this.salary = salary;
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullname != null ? fullname.equals(employee.fullname) : employee.fullname == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(25000.5,"Petrov","June 5, 2018");
        employees[1] = new Employee(20000.5,"Ivanov");
        employees[2] = new Employee(15000.5,"Semenov");

        FullReport.generateFullReport(employees);
    }

}
