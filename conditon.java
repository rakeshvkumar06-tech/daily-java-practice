import java.util.Scanner;
public class conditon {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int a = scanner.nextInt();
        if (a >= 90) {
            System.out.println("Grade A");
        } 
        else if (a >= 70) {
            System.out.println("Grade B");
        } 
        else if (a >= 60) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
