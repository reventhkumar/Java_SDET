import java.util.Scanner;

public class FindRemainders {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try{
                System.out.println("Enter value 1");
                String userInput1 = myScanner.nextLine();
                System.out.println("Enter value 2");
                String userInput2 = myScanner.nextLine();
                int input1 = Integer.parseInt(userInput1);
                int input2 = Integer.parseInt(userInput2);
                if(input1<=0 || input2<=0){
                    System.out.println("Value's should be greater than 0");
                    continue;
                }else{
                    int result = input1 % input2;
                    System.out.println(result);
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("The Value should be of number! try again?");
                continue;
            }
        }
        myScanner.close();
    }
}