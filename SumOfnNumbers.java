import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int result =0;
        while (result==0) {
            try{
                System.out.println("Enter a Input");
                String input = myScanner.nextLine();
                int userInput = Integer.parseInt(input);
                if(userInput>=2){
                    for(int i =0; i<=userInput; i++){
                        result += i;
                    }
                } else if (userInput <=0){
                    for(int i =userInput; i<=0; i++){
                        result += i;
                    }
                }
                    System.out.println(result);
            }
            catch(NumberFormatException e){
                System.out.println("Enter a valid input, try again?");
            }
        }
            myScanner.close();
        
    }
}
