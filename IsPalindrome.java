import java.util.Scanner;

public class IsPalindrome {

    public static void main(String a[]){
        Scanner myScanner = new Scanner(System.in);
        StringBuilder sBuilder = new StringBuilder();
        String input ="";
            while(input.length() <= 0){
                System.out.println("Enter your Input");
                input = myScanner.nextLine();
                sBuilder.append(input);
                sBuilder.reverse();
                if(input.isBlank() || input.isEmpty()){
                    System.out.println("Invalid Input! Try again?");
                } else if(input.equalsIgnoreCase( sBuilder.toString())){
                    System.out.println("The input text is a palindrome");
                } else{
                    System.out.println("The Input text is not a palindrome");
                }
            }
        myScanner.close();
        

    }
    
}
