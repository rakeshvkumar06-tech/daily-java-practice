import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double[] monthlySalary = new double[3];

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name : ");
        empName = sc.nextLine();

        System.out.println("Enter 3 Monthly Salaries:");
        for (int i = 0; i < 3; i++) {
            monthlySalary[i] = sc.nextDouble();
        }
    }

    void displayDetails() {
        double total = 0;

        for (int i = 0; i < 3; i++) {
            total += monthlySalary[i];
        }

        double average = total / 3;

        int vowelCount = 0;
        String nameLower = empName.toLowerCase();

        for (int i = 0; i < nameLower.length(); i++) {
            char ch = nameLower.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        String reverse = "";
        for (int i = empName.length() - 1; i >= 0; i--) {
            reverse += empName.charAt(i);
        }

        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + empName);

        System.out.println("\nTotal Salary : " + total);
        System.out.println("Average Salary : " + average);

        System.out.println("\nNumber of Vowels : " + vowelCount);
        System.out.println("Reversed Name : " + reverse);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.getData();
        e.displayDetails();
    }
}