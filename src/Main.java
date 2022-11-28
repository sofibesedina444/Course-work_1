public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Максим", "Олегович", "Зайцев",
                1, 51000);
        employees[1] = new Employee("Антонина", "Ивановна", "Кривошея",
                1, 45000);
        employees[2] = new Employee("Семен", "Станиславович", "Крикун",
                2, 82000);
        employees[3] = new Employee("Ирина", "Анатольевна", "Шевелева",
                2, 35000);
        employees[4] = new Employee("Татьяна", "Эдуардовна", "Бисер",
                3, 74000);
        employees[5] = new Employee("Кристина", "Петровна", "Боль",
                3, 66000);
        employees[6] = new Employee("Виталий", "Андреевич", "Перевертайло",
                4, 90000);
        employees[7] = new Employee("Анатолий", "Викторович", "Ломако",
                4, 80000);
        employees[8] = new Employee("Ксения", "Сергеевна", "Липко",
                5, 50000);
        employees[9] = new Employee("Александр", "Федорович", "Селин",
                5, 67000);

        displayEmployees();
        System.out.println("Сумма затрат на зарплату в месяц: " + calculateSumSalary() + " рублей" + "\n");
        System.out.println("Минимальная зарплата: " + "\n" + findMinimumSalary());
        System.out.println("Максимальная зарплата: " + "\n" + findMaximumSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSumSalary() + " рублей" + "\n");
        displayFullName();
    }

    private static void displayEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee findMinimumSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee fullNameEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                fullNameEmployee = employee;
            }
        }
        return fullNameEmployee;
    }

    private static Employee findMaximumSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee fullNameEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                fullNameEmployee = employee;
            }
        }
        return fullNameEmployee;
    }

    private static double calculateAverageSumSalary() {
        int length = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                length++;
            }
        }
        if (length != 0) {
            return (double) calculateSumSalary() / length;
        }
        return 0;
    }

    private static void displayFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}