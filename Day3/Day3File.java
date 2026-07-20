package Day3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day3File {
    public static void main(String[] args) {
        File f = new File("Day3/names.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    
        }
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    
        }

    }
}
