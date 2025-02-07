import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" 1. add\n 2. subtract\n 3. divide\n 4. multiply");

        System.out.println("Choose your operator. (1-4)");
        Scanner scan = new Scanner(System.in);
            int operator = scan.nextInt();

        int n1, n2;
        System.out.println("Enter first number.");
            n1 = scan.nextInt();
        System.out.println("Enter second number.");
            n2 = scan.nextInt();

        int result = 0;
        switch(operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 / n2;
                break;
            case 4:
                result = n1 * n2;
                break;
            default:
                System.out.println("error.");
        }
        System.out.println("Result is : "+result);

        }
    }
