import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * q7
 */
public class q7 {
    public static void main(String[] args) {
        String file;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of file");
        file = sc.next();

        try {
            File myFile = new File(file);
            Scanner fileReader = new Scanner(myFile);
            System.out.println("Lines starting with //");
            String line;
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                if (line.startsWith("//"))
                    System.out.println(line);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error occured : " + e);
        }

        sc.close();
    }
}