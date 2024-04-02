import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nEmployees;
        char outSourced;
        String employeeName;
        int employeeHours;
        double employeeVPH;
        double addCharge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        nEmployees = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < nEmployees; i++) {
            Employee emp;
            System.out.println("Employee #" + nEmployees + " data:");
            System.out.println("Outsourced (y/n)?");
            outSourced = scanner.next().charAt(0);
            System.out.println("name:");
            employeeName = scanner.next();
            System.out.println("Hours:");
            employeeHours = scanner.nextInt();
            System.out.println("Value per Hour:");
            employeeVPH = scanner.nextDouble();
            emp = switch (outSourced) {
                case 'y' -> {
                    System.out.println("AdditionalCharge:");
                    addCharge = scanner.nextDouble();
                    yield new OutsourcedEmployee(employeeName, employeeHours, employeeVPH,addCharge);
                }
                case 'n' -> new Employee(employeeName, employeeHours, employeeVPH);
                default -> {
                    System.out.println("Default choice (y)! ");
                    System.out.println("AdditionalCharge:");
                    addCharge = scanner.nextDouble();
                    yield new OutsourcedEmployee(employeeName, employeeHours, employeeVPH,addCharge);
                }
            };
            employees.add(emp);
        }
        System.out.println("Payments:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - $" + emp.payment());
        }
    }
}