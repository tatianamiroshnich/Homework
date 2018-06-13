package employee;

import java.util.Locale;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("|          ФИО          | %-10s |%n", "Оклад, грн");

        for (Employee employee : employees) {
            String fio = employee.getFullname();
            double salary = employee.getSalary();
            System.out.printf("%15s%20s%n",fio,salary);
        }

    }


}
