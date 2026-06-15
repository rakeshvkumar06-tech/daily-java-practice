import java.util.Scanner;
public class operators {              
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();


        System.out.println("Arithematic opration");
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " +(a-b));
        System.out.println("Product: " +(a*b));
        System.out.println("Quotient: " +(a/b));
        System.out.println("Remainder: " +(a%b));

        System.out.println("Logical AND :");
        System.out.println((a > b) && (a < c));  
        System.out.println((a < b) && (a < c));   

        System.out.println("\nLogical OR :");
        System.out.println((a > b) || (a > c));  
        System.out.println((a < b) || (a > c));  

        System.out.println("\nLogical NOT:");
        System.out.println(!(a > b));         
        System.out.println(!(a < b));

        System.out.println("Assignment opration");
        System.out.println("Initial value of a: " + a);
        a += 5;   
        System.out.println("a += 5 : " + a);
        a -= 3;  
        System.out.println(" a -= 3 : " + a);
        a *= 2;  
        System.out.println(" a *= 2 : " + a);
        a /= 4; 
        System.out.println(" a /= 4 : " + a);
        a %= 3; 
        System.out.println(" a %= 3 : " + a);
    scanner.close();


    }
}
   

