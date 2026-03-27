package fintech.driver;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

public class Driver2 {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in); 
        String line; 

        while (scanner.hasNextLine()) { 
            line = scanner.nextLine(); 

            if (line.equals("---")) { 
                break;
            }

            String[] parts = line.split("#"); 

            if (parts.length == 4) {
                String username = parts[0];
                String name = parts[1];
                int status = parts[2]; 
               
        for (Student student : students) { 
            System.out.println(student.toString()); 
        }

        scanner.close();
    }
}


    }

}