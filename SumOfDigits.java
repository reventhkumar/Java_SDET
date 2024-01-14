import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int result =0;
        String userInput = "";
            while (true) {
                System.out.println("Enter your numbers");
                userInput = myScanner.nextLine();
                char array[] = userInput.toCharArray();
                for(int i=0; i<userInput.length();i++){
                    if(Character.isDigit(array[i])){
                        result = result+ Character.getNumericValue(array[i]);
                    }else{
                        System.out.println("The value is not a valid sequence, try again?");
                        break;
                    }
                }
                if(result!=0){
                    System.out.println("Sum of "+userInput+" is "+result);
                    break;
                }
                myScanner.close();
            } 

    }
}
