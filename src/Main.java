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

        //Базовый уровень сложности
        displayEmployees();
        System.out.println("Сумма затрат на зарплату в месяц: " + calculateSumSalary() + " рублей" + "\n");
        System.out.println("Минимальная зарплата: " + "\n" + findMinimumSalary());
        System.out.println("Максимальная зарплата: " + "\n" + findMaximumSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSumSalary() + " рублей" + "\n");
        displayFullName();
        //Повышенный уровень сложности
        double percentSalary = 0.5;
        calculateIndexSalary(percentSalary);
        int departmentNumber = 3;
        System.out.println("Минимальная зарплата по отделу № " + departmentNumber + ": " + "\n" +
                findEmployeeMinimumSalary(departmentNumber));
        System.out.println("Максимальная зарплата по отделу № " + departmentNumber + ": " + "\n" +
                findEmployeeMaximumSalary(departmentNumber));
        System.out.println("Сумма затрат на зарплату в месяц по отделу № " + departmentNumber + ": " +
                calculateSumSalaryDepartment(departmentNumber) + " рублей" + "\n");
        System.out.println("Среднее значение зарплат по отделу № " + departmentNumber + ": " +
                calculateAverageSumSalaryDepartment(departmentNumber) + " рублей" + "\n");
        calculateIndexSalaryDepartment(percentSalary, departmentNumber);
        System.out.println("Сотрудники отдела №" + departmentNumber + ": ");
        displayFullNameDepartment(departmentNumber);
        int randomNumber = 50500;
        System.out.println("Cотрудники с зарплатой меньше " + randomNumber + " рублей: " + "\n");
        compareEmployeeMinimumSalary(randomNumber);
        System.out.println("Cотрудники с зарплатой больше " + randomNumber + " рублей: " + "\n");
        compareEmployeeMaximumSalary(randomNumber);
    }

    //Базовый уровень сложности
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

    //Повышенный уровень сложности
    private static void calculateIndexSalary(double percentSalary) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((int) (employee.getSalary() + (employee.getSalary() * percentSalary / 100)));
                System.out.println("После индексации зарплата " + employee.getFullName() + " составляет "
                        + employee.getSalary() + " рублей");
            }
        }
    }

    private static Employee findEmployeeMinimumSalary(int departmentNumber) {
        int minSalary = Integer.MAX_VALUE;
        Employee fullNameEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary &&
                    employee.getDepartmentNumber() == departmentNumber) {
                minSalary = employee.getSalary();
                fullNameEmployee = employee;
            }
        }
        return fullNameEmployee;
    }

    private static Employee findEmployeeMaximumSalary(int departmentNumber) {
        int maxSalary = Integer.MIN_VALUE;
        Employee fullNameEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary &&
                    employee.getDepartmentNumber() == departmentNumber) {
                maxSalary = employee.getSalary();
                fullNameEmployee = employee;
            }
        }
        return fullNameEmployee;
    }

    private static int calculateSumSalaryDepartment(int departmentNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static double calculateAverageSumSalaryDepartment(int departmentNumber) {
        int length = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                length++;
            }
        }
        if (length != 0) {
            return (double) calculateSumSalaryDepartment(departmentNumber) / length;
        }
        return 0;
    }

    private static void calculateIndexSalaryDepartment(double percentSalary, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary((int) (employee.getSalary() + (employee.getSalary() * percentSalary / 100)));
                System.out.println("После индексации в отделе №" + departmentNumber + " зарплата " + employee.getFullName() + " составляет "
                + employee.getSalary() + " рублей");
            }
        }
    }

    private static void displayFullNameDepartment(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee.getFullName()
                        + "Зарплата: " + employee.getSalary() + " рублей" + "\n"
                        + "id = " + employee.getId());
            }
        }
    }

    private static void compareEmployeeMinimumSalary(int randomNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < randomNumber) {
                System.out.println(employee.getFullName()
                        + "Зарплата: " + employee.getSalary() + " рублей" + "\n"
                        + "id = " + employee.getId());
            }
        }
    }

    private static void compareEmployeeMaximumSalary(int randomNumber) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= randomNumber) {
                System.out.println(employee.getFullName()
                        + "Зарплата: " + employee.getSalary() + " рублей" + "\n"
                        + "id = " + employee.getId());
            }
        }
    }
}

