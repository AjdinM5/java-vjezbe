package vjezbe_02_11_2026;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
            /*
            Employee emp1 = new Employee("Alice", 101, 50000);

            Manager mgr1 = new Manager("Bob", 102, 80000, 15000);

            // Polymorphism: Employee reference pointing to a Manager object
            Employee emp2 = new Manager("Charlie", 103, 90000, 20000);

            System.out.println(emp1.getDetails());
            emp1.work();

            System.out.println(mgr1.getDetails());
            mgr1.work();

            System.out.println(emp2.getDetails());// Calls overridden method in Manager

            emp2.work();// Demonstrates polymorphism
            */

        ArrayList<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/vjezbe_02_11_2026/EmployeeData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String name = parts[1];
                int id = Integer.parseInt(parts[2]);
                double salary = Double.parseDouble(parts[3]);

                if (type.equals("EMPLOYEE")) {
                    employees.add(new Employee(name, id, salary));

                } else if (type.equals("MANAGER")) {
                    double bonus = Double.parseDouble(parts[4]);
                    employees.add(new Manager(name, id, salary, bonus));
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
            emp.work();
        }
    }
}
