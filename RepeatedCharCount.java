import java.util.Scanner;

public class RepeatedCharCount {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int count =0;
        while (count ==0) {
            System.out.println("Enter a input");
            String input = myScanner.nextLine();
            char array[] = input.toCharArray();
            for(int i = 0; i<input.length(); i++){
                count = 0;
                for(int j=0; j<input.length(); j++){
                    if(array[i]==array[j]){
                        count++;
                    }
                }
                System.out.println("Count of Char "+array[i]+" is "+count);
            }
        }
        myScanner.close();
    }
}
