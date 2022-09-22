package school.lesson3;

public class EmployeesActions {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alex Johnson", "CEO", "aj_ceo@fast.com", "+48202020", 1000, 46);
        employees[1] = new Employee("Tony Writer", "CTO", "tw_cto@fast.com", "+48909090", 900, 41);
        employees[2] = new Employee("Greg Brown", "PM", "gb_pm@fast.com", "+48505050", 800, 34);
        employees[3] = new Employee("Kate White", "QA", "kw_qa@fast.com", "+48303030", 700, 29);
        employees[4] = new Employee("Rose McGregor", "HR", "rm_hr4@fast.com", "+48404040", 600, 23);

        System.out.println("All employees\n");
        Employee.printEmployees(employees);

        System.out.println("Employees older than 40\n");
        Employee.checkAge(employees, 40);
    }
}
