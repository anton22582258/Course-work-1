import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 100_000 + 100_000 * random.nextDouble();
            employees[i] = new Employee(" Name " + i, salary, random.nextInt(1, 6));
        }
        printAll(employees);
        System.out.println();
        System.out.println(getSum(employees));
        System.out.println();
        System.out.println(getEmployeeWithMinSalary(employees));
        System.out.println(getEmployeeWithMaxSalary(employees));
        System.out.println();
        printAllFullName(employees);
    }

    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getSum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null || maxEmployee.getSalary() < employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double getAverage(Employee[] employees) {
        return getSum(employees) / employees.length;
    }

    public static void printAllFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }


       
    }
}
