package fintech.driver;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

public class Driver4 {
    private static ArrayList<Username> username = new ArrayList<>();
    private static ArrayList<Name> name = new ArrayList<>();
    private static ArrayList<Status> status = new ArrayList<>();

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.equals("---")) {
                break; 
            }

            String[] segments = line.split("#");
            if (segments.length < 1) {
                System.err.println("Input tidak valid: " + line);
                continue; 

            String command = segments[0]; 
            
            String[] dataParts = new String[segments.length - 1];
            System.arraycopy(segments, 1, dataParts, 0, segments.length - 1);

            switch (command) {
                    
                    if (dataParts.length == 4) {
                        String username = parts[0];
                        String name = parts[1];
                        int status = parts[2]; 
               
            
                    
                    if (dataParts.length == 4) {
                        String username = parts[0];
                        String name = parts[1];
                        int status = parts[2]; 
               
                    } else {
                        System.err.println("Format input student-add tidak valid: " + line);
                    }
                    break;
                    
                    if (dataParts.length == 4) {
                        String username = parts[0];
                        String name = parts[1];
                        int status = parts[2]; 
               
               
                        enrollments.add(new Enrollment(courseCode, studentNim, academicYear, semester));
                    } else {
                        System.err.println("Format input enrollment-add tidak valid: " + line);
                    }
                    break;
                default:
                    System.err.println("Perintah tidak dikenal: " + command);
                    break;
            }
        }

        scanner.close();
        
        }
    }                         

}
