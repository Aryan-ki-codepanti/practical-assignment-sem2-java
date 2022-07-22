import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No command line arguments given");
            return;
        }

        String source = args[0];
        String destination = args[1];

        try{

            File sourceFile = new File(source);
            FileWriter destinationFile = new FileWriter(destination);
            Scanner sc = new Scanner(sourceFile);

            String line;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                destinationFile.write(line + "\n");
            }
            destinationFile.close();
            sc.close();
        }
        catch(IOException e){
            System.out.println("Error occured : " + e);
        }

    }
}