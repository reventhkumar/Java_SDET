import java.util.Scanner;

public class LeastOfThreeNumbers {


    public static void main(String a[])
    {
        String userInput1;
        String userInput2;
        String userInput3;
        int LeastNumber = 0;

        Scanner myScanner = new Scanner(System.in);

            while (LeastNumber ==0) 
            {
                System.out.println("Enter Value 1: ");
                userInput1 = myScanner.nextLine();
                System.out.println("Enter Value 2: ");
                userInput2 = myScanner.nextLine();
                System.out.println("Enter Value 3: ");
                userInput3 = myScanner.nextLine();

                try{
                    int A = Integer.parseInt(userInput1); // 50
                    int B = Integer.parseInt(userInput2); // 1
                    int C = Integer.parseInt(userInput3); // 20

                    if(A==B||C==A||B==C){
                        System.out.println("Repeating the same numbers is not allowed, try again \n");
                    } else{
                        LeastNumber = A<B ? A : B; 
                        LeastNumber = B<C ? B : C;
                        System.out.println("Least number is: " + LeastNumber);
                    }
                    
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Enter valid Numbers, try again \n");
                }
               
            }
            myScanner.close();
    }
    
}
