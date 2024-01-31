import java.util.Scanner;

public class statsReader {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        myScanner.close();
        input = input.replaceAll(":", "=");
        input = input.replaceAll("\\{", "");
        input = input.replaceAll("}", "");
        input = input.replaceAll("=", "--> ");
        String arrayInput[] = input.split("\",", -2);
        arrayInput = input.split(",\"", -2);
        System.out.println("The stats are");
        for(int i=0;i<arrayInput.length;i++){
            String result = arrayInput[i].replace("\"", " ");
            result = result.stripIndent();
            if(result.contains("rid")){
                result = result.replaceFirst("rid", "RowId");
            }else if(result.contains("uid")){
                result = result.replaceFirst("uid", "UserId");
            }else if(result.contains("ss")){
                result = result.replaceFirst("ss", "Subspecies");
            }else if(result.contains("sts")){
                result = result.replaceFirst("sts", " ServerTimestamp");
            }else if(result.contains("gid")){
                result = result.replaceFirst("gid", "GameId");
            }else if(result.contains("et")){
                result = result.replaceFirst("et", "EventType");
            }else if(result.contains("did")){
                result = result.replaceFirst("did", "DeviceId");
            }else if(result.contains("cv")){
                result = result.replaceFirst("cv", "ClientVersion");
            }else if(result.contains("o")){
                result = result.replaceFirst("o", "Order");
            }else if(result.contains("cts")){
                result = result.replaceFirst("cts", "ClientTimestamp");
            }else if(result.contains("env")){
                result = result.replaceFirst("env", "Env");
            }else if(result.contains("k")){
                result = result.replaceFirst("k", "Kingdom");
            }else if(result.contains("p")){
                result = result.replaceFirst("p", "Phylum");
            }else if(result.contains("c")){
                result = result.replaceFirst("c", "Class");
            }else if(result.contains("o")){
                result = result.replaceFirst("o", "Order");
            }else if(result.contains("f")){
                result = result.replaceFirst("f", "Family");
            }else if(result.contains("g")){
                result = result.replaceFirst("g", "Genus");
            }else if(result.contains("s")){
                result = result.replaceFirst("s", "Species");
            }
            System.out.println(result);
        }
         System.out.println();
         System.out.println("By Rev_K");
    }
    
}