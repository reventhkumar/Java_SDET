import java.util.Scanner;

public class IsLeapYear {
    public static void main(String a[]){

        Scanner myScanner = new Scanner(System.in);
        int inputValue =0;
        while(true ){
        try{
        System.out.println("Enter a year");
        String userInput = myScanner.nextLine();
        inputValue = Integer.parseInt(userInput);
        if(userInput.length()<=3 || userInput.length()>=5){
            System.out.println("Input year exceeds the limit of characters, try again?");
            continue;
        } else if(inputValue % 100 ==0){
            
            if(inputValue % 400 ==0){
                System.out.println("Its a leap year");
                break;
            } else{
                System.out.println("Its not a leap year");
                break;
            }
        } else if(inputValue % 4==0){
            System.out.println("Its a leap year");
            break;
        } else{
            System.out.println("Its not a leap year");
            break;
        }
        }catch(NumberFormatException e){
            System.out.println("Enter a valid year");
            continue;
        }
    }
       myScanner.close();
    }
}

