import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First value:");
        int value=input.nextInt();

        System.out.println("Enter the second value:");
        int value2=input.nextInt();
        int sum=value+value2;
        System.out.println("The sum of the value is:"+sum);
        int subtract=value-value2;
        System.out.println("The subtract of the value is:"+subtract);
        int multiplication=value*value2;
        System.out.println("The multiplication of the value is:"+multiplication);
        double division=value%value2;
        System.out.println("The division of the value is:"+division);


    }
}
