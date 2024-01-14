import java.util.Scanner;

public class LargestOfnNumbers {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int currentLargetsNumber = 0;
        int tempNumber;
        while (true) {
                try{    
                System.out.println("Enter a number");
                String userinput = myScanner.nextLine();
                tempNumber = Integer.parseInt(userinput);
                System.out.println("wanna add one more number Y/N?");
                String isAddNumber = myScanner.nextLine();
                if(tempNumber>=currentLargetsNumber){
                    currentLargetsNumber = tempNumber;
                }
                if(isAddNumber.equalsIgnoreCase("Y")){
                    tempNumber = Integer.parseInt(userinput);
                    continue;
                }else if(isAddNumber.equalsIgnoreCase("N")){
                    break;
                }else{
                    System.out.println("Invalid input try again");
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Enter a valid number,try again?");
            }
        }
        System.out.println("The Largest number is"+ currentLargetsNumber);
        myScanner.close();
    }
}
