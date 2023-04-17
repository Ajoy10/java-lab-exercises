import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empNo, age;
    String name, designation;
    double salary;

    Employee(int empNo, String name, String designation, int age, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Employee\n2. Delete Employee\n3. Display Employees\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Number: ");
                    int empNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Designation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(empNo, name, designation, age, salary));
                    break;
                case 2:
                    System.out.print("Enter the index of the Employee to delete: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < employees.size()) {
                        employees.remove(index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    if (employees.size() == 0) {
                        System.out.println("No Employees found.");
                    } else {
                        System.out.println("Employees List:");
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        scanner.close();
    }
}
