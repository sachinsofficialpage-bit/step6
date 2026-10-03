class Employee1{
    int empid;
    String empname;
    double Salary;
    boolean isintern;
    public Employee(int empid, String empname, double Salary, boolean isintern){
        this.empid = empid;
        this.empname = empname;
        this.Salary = Salary;
        this.isintern = false;

    }
    public void printProfile() {

        System.out.println(
                empId + " | " +
                empName + " | Rs " +
                salary + " | Intern: " +
                isIntern);
    }
}
public class Employee {

    public static void main(String[] args) {

        Employee permanent =
                new Employee("E-101", "Divya", 65000);

        Employee intern =
                new Employee("E-102", "Arjun");

        permanent.printProfile();
        intern.printProfile();
    }
}