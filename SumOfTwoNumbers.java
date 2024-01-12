import java.util.Scanner;

public class SumOfTwoNumbers {
    //User Input
    static String UserInputA;
    static String UserInputB;
    static int result = 0;
    // Condition 01 Range!
    static int NegativeRange = -9999;
    static int PositiveRange = 9999;

    public static void main(String a[])
    {
        while (result == 0) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            UserInputA = myScanner.nextLine();
            System.out.println("Enter the second number");
            UserInputB = myScanner.nextLine();

            try{
                int A = Integer.parseInt(UserInputA);
                int B = Integer.parseInt(UserInputB);
                result = A + B;
                System.out.println("Sum of "+  A + " and " + B + " is: " + result);
                myScanner.close();
            }
            catch(NumberFormatException e){
                System.out.println("Enter a Valid number for both inputs Try again!! \n");
            }
        }
    }
}