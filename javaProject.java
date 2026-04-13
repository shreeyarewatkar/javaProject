import java.util.*;

class Employee {
    String name;
    int id;
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main Class
public class javaProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Full-Time Input
        System.out.println("Enter Full-Time Employee Details:");
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();

        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        Employee e1 = new FullTimeEmployee(name1, id1, baseSalary, bonus);

        // Part-Time Input
        System.out.println("\nEnter Part-Time Employee Details:");
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();

        Employee e2 = new PartTimeEmployee(name2, id2, hours, rate);

        // FINAL OUTPUT (only salary)
        System.out.println("\nFull Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + e2.calculateSalary());

        sc.close();
    }
}