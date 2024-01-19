import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int initialAmount = 1_00_000;
        int amountWithDraw = 0;
        int denomcount2K = 0;
        int denomcount500 = 0;
        int denomcount200 = 0;
        int denomcount100 = 0;
        int denomcount50 = 0;
        int denomcount20 = 0;
        int denomcount10 = 0;
        int denomcount5 = 0;
        int denomcount2 = 0;
        int denomcount1 = 0;
        while(true){
            System.out.println("Enter an amount to withdraw");
            String userInput = myScanner.nextLine();
            amountWithDraw = Integer.parseInt(userInput);
            if(amountWithDraw >= initialAmount){
                System.out.println("Requested withdraw amount exceeds the ATM limit try again?");
                continue;
            }else if(amountWithDraw <= 0){
                System.out.println("Invalid withdraw amount Try again?");
                continue;
            }else{
                System.out.println("Remaing balance in account is: " + (initialAmount - amountWithDraw));
                break;
            }


            
        }
        while (true) {
            if(amountWithDraw >= 2000){
                amountWithDraw -= 2000;
                denomcount2K++;
                if(amountWithDraw >2000){
                    continue;
                }
            }else if (amountWithDraw >= 500){
                amountWithDraw -= 500;
                denomcount500++;
                if(amountWithDraw >500){
                    continue;
                }
            }else if(amountWithDraw >= 200){
                amountWithDraw -= 200;
                denomcount200++;
                if(amountWithDraw > 200){
                    continue;
                }
            }else if(amountWithDraw >= 100){
                amountWithDraw -= 100;
                denomcount100++;
                if(amountWithDraw >100){
                    continue;
                }
            }else if(amountWithDraw >= 50){
                amountWithDraw -= 50;
                denomcount50++;
                if(amountWithDraw >50){
                    continue;
                }
            }else if(amountWithDraw >= 20){
                amountWithDraw -= 20;
                denomcount20++;
                if(amountWithDraw >20){
                    continue;
                }
            }else if(amountWithDraw >= 10){
                amountWithDraw -= 10;
                denomcount10++;
                if(amountWithDraw >10){
                    continue;
                }
            }else if(amountWithDraw >= 5){
                amountWithDraw -= 5;
                denomcount5++;
                if(amountWithDraw >5){
                    continue;
                }
            }else if(amountWithDraw >= 2){
                amountWithDraw -= 2;
                denomcount2++;
                if(amountWithDraw >2){
                    continue;
                }
            }else if (amountWithDraw >= 1){
                amountWithDraw -= 1;
                denomcount1++;
                if(amountWithDraw >1){
                    continue;
                }
            }else if (amountWithDraw <=0){
                break;
            } 
        }
        int totalNotes = denomcount2K+denomcount500+denomcount200+
                        denomcount100+denomcount50+denomcount20+denomcount10+
                        denomcount5+denomcount2+denomcount1;
        System.out.println("Denomination to withdraw are as follows");
        System.out.println("Total number of notes " + totalNotes);
        System.out.println("2000: " + denomcount2K );
        System.out.println("500: " + denomcount500 );
        System.out.println("200: " + denomcount200 );
        System.out.println("100: " + denomcount100 );
        System.out.println("50: " + denomcount50 );
        System.out.println("20 " + denomcount20 );
        System.out.println("10: " + denomcount10 );
        System.out.println("5: " + denomcount5);
        System.out.println("2: " + denomcount2);
        System.out.println("1: " + denomcount1);
        myScanner.close();
        
    }
    
}
