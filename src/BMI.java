import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight:");
        double weight= input.nextDouble();

        System.out.println("Enter the height:");
        double height= input.nextDouble();


        double BMI=weight/height*height;
        System.out.println("The Body Mass Index is:"+BMI);

        if(BMI<=18.5){
            System.out.println("Under weight");
        } else if(BMI>=18.5 && BMI <=25){
            System.out.println("Normal weight");
        }

    }
}
