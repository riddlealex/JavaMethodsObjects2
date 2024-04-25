public class Employee {
    private static int counter = 0;
    private final String name;
    private int department;
    private int salary;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Номер "+this.id +" ФИО "+this.name+" Отдел "+this.department+" Зарплата "+ this.salary;
    }
}
