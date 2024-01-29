import java.util.Scanner;

public class IsPrimeNumber
{
    public static void main(String a[]) {
        Scanner myScanner = new Scanner(System.in);
        int givenNumber = 0;
        while(givenNumber == 0){   
            try {
                System.out.println("Enter a number");
                String userInput = myScanner.nextLine();
                givenNumber  = Integer.parseInt(userInput);
                int tempint = 0;
                    if(givenNumber <= 1) {
                        System.out.println("The Number should be greater than 1 for a valid prime number");
                    }
                    for(int i=2; i<givenNumber/2; i++) {
                        if(givenNumber % i ==0) {
                            tempint++;
                            break;
                        }
                    }
                    if(tempint==0 &&  givenNumber!= 0) {
                        System.out.println("Its a prime number");
                    } else {
                        System.out.println("Not a prime number");
                    }
            }  
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input, Try Again"); 
                continue;
            }
               
        }
        myScanner.close();
    }
}