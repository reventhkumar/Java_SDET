import java.util.Scanner;

public class FindingFactorial {

    public static void main(String a[])
    {
        Scanner myScanner = new Scanner(System.in);
        long result = 1;

        while (result == 1) {
            System.out.println("Enter any number to find its factorial");
            String userInput = myScanner.nextLine();

            try{
                int givenNumber  = Integer.parseInt(userInput);
                if(givenNumber <=0){
                    System.out.println("Enter a valid Input");
                    continue;
                }
                for(int i = 1; i <= givenNumber; i++)
                {
                    result = result * i;
                }
                System.out.println("The factorial of " + givenNumber +" is: "+ result);
                break;
                
            }
            catch(NumberFormatException e){
                System.out.println("Invalid Input, Try again!");
            }
            
        }
        myScanner.close();

    }
    
}
