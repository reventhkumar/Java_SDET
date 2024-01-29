import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Paste your stats below");
            String input = myScanner.nextLine();
            myScanner.close();
            input = input.replaceAll(":", "=");
            input = input.replaceAll("\\{", "");
            input = input.replaceAll("}", "");
            input = input.replaceAll("=", "--> ");
            String arrayInput[] = input.split("\",", -2);
            arrayInput = input.split(",\"", -2);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println();
            System.out.println("Your stats are as follow:");
            System.out.println();
            System.out.println();
            for(int i=0;i<arrayInput.length;i++){
                String result = arrayInput[i].replace("\"", " ");
                System.out.println(result.strip().stripIndent().stripTrailing());
            }
            
        }
    
}