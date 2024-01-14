import java.util.Scanner;

public class FirstnFibbonoci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter the Fibbonoci length");
                String count = myScanner.nextLine();
                long nFib = Integer.parseInt(count);
                System.out.println("Enter the Starting number");
                String Snumber = myScanner.nextLine();
                long B = Integer.parseInt(Snumber);
                System.out.println("A Fibbonoci series staring with "+B+" are as follow");
                long A = 0;
                long C = 0;
                System.out.println(A);
                System.out.println(B);
                System.out.println(C = A + B);
                for(int i =0;i< nFib;i++){
                    C = A + B;
                    A = B;
                    B = C;
                    C = A + B;
                    System.out.println(C);
                }   
                break;
            }catch(NumberFormatException e){
                System.out.println("The input entered is not a number! try again? ");
                continue;
            }           
        }
        myScanner.close();
    }   
}
