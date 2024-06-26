import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
         boolean isValid=true;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter valid Email:");
        String email = input.nextLine();
        if(isValid==true){
            System.out.println("is Validate");
        }
        else
        {
            System.out.println("is not validate");
        }
    }
}




