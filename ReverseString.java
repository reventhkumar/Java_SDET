import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        while (true) {
            System.out.println("Enter your text to be reversed");
            String userInput = myScanner.nextLine();
            if(userInput.length() <=2){
                System.out.println("The Input lenght should be greater than 2,Try again?");
                continue;
            }
            StringBuilder sBuilder = new StringBuilder();
            sBuilder.append(userInput);
            String RuserInput = sBuilder.reverse().toString();
            System.out.println("The Reverse of "+userInput+" is "+RuserInput);
            break;
        }
            myScanner.close();
    }
    
}