import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        char grade ='I';
        int userInput =0;
        while (userInput==0) {
            try{
                System.out.println("Enter Mark");
                String uInput = mScanner.nextLine();
                userInput = Integer.parseInt(uInput);
                if(userInput>=0 && userInput<=25){
                    grade = 'F';
                } else if(userInput>=26 && userInput<=45){
                    grade = 'E';
                } else if(userInput>=46 && userInput<=50){
                    grade = 'D';
                } else if(userInput>=51 && userInput<=60){
                    grade = 'C';
                } else if(userInput>=61 && userInput<=80){
                    grade = 'B';
                } else if(userInput>=81 && userInput<=100){
                    grade = 'A';
                } else{
                    System.out.println("Invalid Marks enter a number "+
                    "between 0 and 100, try again?");
                    userInput = 0;
                }
            
            }catch(NumberFormatException e)
            {
                System.out.println("Invalid Input, Try again?");
            }
        }
        System.out.println("The grade is "+grade);
        mScanner.close();

    }
}