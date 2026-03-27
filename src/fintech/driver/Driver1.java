package fintech.driver;

import java.util.Scanner;

/**
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

public class Driver1 {
    private static Course[] courses = new Course[100];
    private static int courseCount = 0;

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        while (scanner.hasNextLine()) { 
            line = scanner.nextLine(); 

            if (line.equals("---")) { 
                break;
            }

            String[] parts = line.split("#"); 

            if (parts.length == 3) {
                String username = parts[0];
                String name = parts[1];
                int status = parts[2];
                
                if (courseCount < courses.length) { 
                    courses[courseCount] = new Course(username, name, status);
                    courseCount++;
                } else {
                    System.err.println("Penyimpanan penuh, tidak bisa menambah course baru.");
                }
            } else {
                System.err.println("Format input tidak valid: " + line);
            }
        }

        // Setelah semua input diproses, tampilkan semua course yang telah disimpan
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].toString()); 
        }

        scanner.close();
    }
}