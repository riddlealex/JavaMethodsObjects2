public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Петров Александр Иванович", 3, 21000);
        employee[1] = new Employee("Иванов Михаил Илларионович", 1, 39000);
        employee[2] = new Employee("Светлый Николай Николаевич", 1, 37000);
        employee[3] = new Employee("Баринов Василий Иванович", 1, 17000);
        employee[4] = new Employee("Мотин Матвей Матвеевич", 2, 45000);
        employee[5] = new Employee("Полежайкин Алексей Александрович", 1, 33000);
        employee[6] = new Employee("Робертов Илья Павлович", 2, 28000);
        employee[7] = new Employee("Анциферов Денис Петрович", 3, 27000);
        employee[8] = new Employee("Золотов Даниил Данилович", 1, 31000);
        employee[9] = new Employee("Мешков Степан Степанович", 3, 33000);

        printAllEmployers();
        System.out.println("Сумма затрат на зп в месяц = " + calculateTotalSalary());
        System.out.println("Средняя зарплата в месяц = "+calculateMiddleSalary(calculateTotalSalary()));

        printMinSalary();
        printMaxSalary();

        allEmployee();

    }
    public static void printAllEmployers() {
        for (int i = 0; i < employee.length; i++) {
            Employee employ = employee[i];
            if (employ != null) {
                System.out.println(employ);
            }
        }
    }

    private static int calculateTotalSalary() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (null == employee[i]) {
                continue;
            }
            total = total + employee[i].getSalary();
        }
        return total;
    }

    private static int calculateMiddleSalary(int t) {
        int b = t/employee.length;
        return b;
    }

    private static void printMinSalary() {
        int a = Integer.MAX_VALUE;
        int b = 0;
        String c = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < a) {
                a = employee[i].getSalary();
                b = employee[i].getId();
                c = employee[i].getName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:"+" Зарплата:"+a+" ID сотрудника:"+b+ " Имя сотрудника:"+ c);
    }

    private static void printMaxSalary() {
        int a = Integer.MIN_VALUE;
        int b = 0;
        String c = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > a) {
                a = employee[i].getSalary();
                b = employee[i].getId();
                c = employee[i].getName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой:"+" Зарплата:"+a+" ID сотрудника:"+b+ " Имя сотрудника:"+ c);
    }

    public static void allEmployee() {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getId()+" "+employee[i].getName());
        }
    }

}