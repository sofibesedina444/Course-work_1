public class Employee {
    public static int counter = 1;
    private final String firstName;
    private final String secondName;
    private final String familyName;
    private int departmentNumber;
    private int salary;
    private int id;

    public Employee(String firstName, String secondName, String familyName, int departmentNumber, int salary) {
        this.id = Employee.counter++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.familyName = familyName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        String separator = " ";
        return "Ф.И.О cотрудника:" + separator + familyName + separator + firstName + separator + secondName + "\n";
    }

    @Override
    public String toString() {
        String separator = " ";
        return "Сотрудник:" + separator + "\n" +
                "Ф.И.О:" + separator + familyName + separator + firstName + separator + secondName + "\n" +
                "№ отдела:" + separator + departmentNumber + "\n" +
                "Заработная плата:" + separator + salary + separator + "рублей" + "\n" +
                "id = " + id + "\n";
    }
}
