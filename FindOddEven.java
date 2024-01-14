import java.util.Scanner;

public class FindOddEven {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter a number");
                String userInput = myScanner.nextLine();
                int input = Integer.parseInt(userInput);
                    if(input==0){
                        System.out.println("The Value should be greated than zero,try again!");
                        continue;
                    }
                    if(input%2 ==0)
                    {
                        System.out.println("It's a even number");
                        break;
                    }else{
                        System.out.println("It's a odd number");
                        break;
                    }  
            }catch(NumberFormatException e){
                System.out.println("The Value should be a Number,try again?");
                continue;
            }  
        }
        myScanner.close();
    }
}
