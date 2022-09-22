package school.lesson3;

public class Employee {

    private String nameSurname;
    private String position;
    private String email;
    private String contact;
    private Integer salary;
    private Integer age;

    public String getNameSurname() {
        return nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String nameSurname, String position, String email, String contact, Integer salary, Integer age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }

    public static void printEmployees(Employee employees[]) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void checkAge(Employee[] employees, int age) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee:   " + getNameSurname() + '\n' +
                "Position:  " + getPosition() + '\n' +
                "E-mail:    " + getEmail() + '\n' +
                "Contact:   " + getContact() + '\n' +
                "Salary:    " + getSalary() + '\n' +
                "Age:       " + getAge() + '\n';
    }
}
