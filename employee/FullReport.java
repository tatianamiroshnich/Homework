package employee;

public class FullReport {
    public static void generateFullReport(Employee[] employees) {

        System.out.printf("%-10s%10s%25s%n-----------------------------" +
                "-------------------%n", "ФИО", "Оклад, грн", "Дата выдачи зарплаты");

        for (Employee employee : employees) {
            String fullname = employee.getFullname();
            double salary = employee.getSalary();
            String salaryDate = employee.getSalaryDate();
            System.out.printf("%-10s%10.2f%20s%n", fullname, salary, salaryDate);
        }

    }
}
