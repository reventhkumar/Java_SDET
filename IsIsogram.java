import java.util.Scanner;

public class IsIsogram {
    public static void main(String a[]){

        Scanner myScanner = new Scanner(System.in);
        String input="" ;
        
        while(true){
            System.out.println("Enter a Input");
            input =myScanner.nextLine();
            if(input.length()==0  || input.isEmpty() ||input.isBlank()){
                System.out.println("Invalid input");
                continue;
            }else if(input.length()==1){
                System.out.println("Please enter more than one character");
                continue;
            }
            char tempstring[] = input.toCharArray();
            int tempint =0;
            for(int i=0; i<input.length();i++){
                for(int j=0; j<input.length(); j++){
                    char tempi = tempstring[i];
                    char tempj = tempstring[j];
                    if(tempi==tempj){
                        tempint++;
                    }
                }
            }
            if(tempint>input.length()){
                System.out.println("The Input"+input+"is not isogram");
                break;
            }else{
                System.out.println("The Input"+input+"is a isogram");
                break;
            }
        }
            myScanner.close();
            
    }  
}       


    
    
