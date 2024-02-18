import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // ================ Task 1 ====================

//        int num1, num2, num3;
//        System.out.println("Enter the first number: ");
//        num1 = input.nextInt();
//        System.out.println("Enter the second number: ");
//        num2 = input.nextInt();
//        System.out.println("Enter the third number: ");
//        num3 = input.nextInt();
//
//        checkSmallest(num1, num2, num3);
//


        // ================ Task 2 ====================

//
//        System.out.println("enter the number to check if it's zero, positive, or negative: ");
//        int checkNum = input.nextInt();
//        System.out.println("the number : " + checkTheNumber(checkNum));



// ================ Task 3 ====================

        System.out.println("1. a password must have at least eight characters");
        System.out.println("2. a password consists of only letters and digits");
        System.out.println("3. a password must contain at least two digits");

        System.out.println("Enter the password: ");
        String password = input.nextLine();
        if (isValidPass(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is not valid. Please review the conditions.");
        }

    }


    // ================ Task 1 Method ====================

    public static void checkSmallest(int num1, int num2, int num3){
        if(num1 < num2){
            if(num1 < num3){
                System.out.println("the smallest value is: " + num1);
            }else{
                System.out.println("the smallest value is: " + num3);
            }
        } else if (num2 < num3) {
            System.out.println("the smallest value is: " + num2);

        }else{
            System.out.println("the smallest value is: " + num3);
        }
}

// ================ Task 2 Method ====================

public static String checkTheNumber(int num){
        if(num == 0){
            return "Zero";
        } else if (num > 0) {
            return "Positive";
        }else{
            return "negative";
        }
}





// ================ Task 3 Method ====================
    private static boolean isValidPass(String pass) {
        if (pass.length() < 8) {
            System.out.println("a password must have at least eight characters");
            return false;
        }

        if (!pass.matches(".*[a-zA-Z].*") || !pass.matches("[a-zA-Z0-9]+")) {
            System.out.println(" a password consists of only letters and digits");

            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                digitCount++;
            }
        }

        if(digitCount < 2){
            System.out.println(" a password must contain at least two digits ");
        }
        return digitCount >= 2;
    }
    }


