import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); 
        StringBuffer sBuffer = new StringBuffer();
        String Sresult = "";
        while (true){
            try{
                System.out.println("Enter your sentence!");
                String userInput = myScanner.nextLine();
                String afterSplit[]= userInput.split(" ");
                for(int i=0;i<afterSplit.length;i++){
                    String indexzero = afterSplit[i].substring(0,1);
                    String a = afterSplit[i].substring(0, 1).toUpperCase();
                    String result = afterSplit[i].replaceFirst(indexzero, a);
                    sBuffer.append(result + " ");
                    Sresult = sBuffer.toString();
                }
                System.out.println(Sresult);
                break;
            } catch(Exception e){
                System.out.println("Not a valid input,try again?");
            }
        }
        myScanner.close();
    }

}