import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temp value");
        double temp= input.nextDouble();

        System.out.println("Enter 'C' to convert celsius into fahrenheit or 'F' to convert fahrenheit into celsius");
           char scale=input.next().charAt(0);

        if(scale == 'C' || scale == 'C'){
            double fahrenheit=(temp*9/5)+32;
            System.out.println(temp+"degrees fahrenheit is equals to"+fahrenheit+"degrees Fahrenheit");
        } else if(scale == 'F' || scale == 'F'){
            double celsius=(temp-32)*5/9;
            System.out.println(temp+"degrees celsius is equals to"+celsius+"degrees celsius");
        } else {
            System.out.println("invalid input.please enter a 'C' or 'F'.");
        }
    }
}
