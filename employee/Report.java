package employee;

import java.util.Locale;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("|          ФИО          | %-10s |%n", "Оклад, грн");

        for (Employee employee : employees) {
            String fio = employee.getFullname();
            System.out.println(fio);
        }

    }


}
