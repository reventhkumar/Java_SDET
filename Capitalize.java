import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); 
        StringBuffer sBuffer = new StringBuffer();
        while (true) {
            try{
                System.out.println("Enter your sentence!");
                String userInput = myScanner.nextLine();
                String Ainput[]= userInput.split(" ");
                String result[] = new String[userInput.length()];
                String Sresult ="";
                    for(int i =0; i<Ainput.length;i++){
                        char toCap = Ainput[i].charAt(0);
                        char UpperCased = Character.toUpperCase(toCap);
                        String Replaced = Ainput[i].replace(toCap, UpperCased);
                        result[i] = Replaced;
                        sBuffer.append(result[i] + " ");
                        Sresult = sBuffer.toString();
                    }
                System.out.println(Sresult);
                break;
            }catch(Exception e){
                System.out.println("Not a valid input,try again?");
            }
        }
        myScanner.close();
    }

}