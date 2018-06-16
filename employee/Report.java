package employee;

import java.util.Locale;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-10s%10s%n--------------------%n","ФИО","Оклад, грн");

        for (Employee employee : employees) {
            String fullname = employee.getFullname();
            double salary = employee.getSalary();
            System.out.printf("%-10s%10.2f%n",fullname,salary);
        }

    }
}
