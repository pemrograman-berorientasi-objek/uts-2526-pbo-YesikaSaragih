package fintech.driver;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */
      
public class Driver3 {
    private static ArrayList<Enrollment> enrollments = new ArrayList<>();

    public static void main(String[] args) {
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
               
               

                enrollments.add(new Enrollment(courseCode, studentNim, academicYear, semester));
            } else {
                System.err.println("Format input tidak valid: " + line);
            }
        }

        for (Enrollment enrollment : enrollments) { 
            System.out.println(enrollment.toString()); /
        }

        scanner.close();
    }
}      
