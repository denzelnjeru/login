import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LoginProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String correctUsername = "admin";
            String correctPassword = "password";
            int maxAttempts = 3;
            int attempts = 0;
            
            while (attempts < maxAttempts) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = getPasswordInput();
                
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    break;
                } else {
                    System.out.println("Incorrect username or password. Please try again.");
                    attempts++;
                    int remainingAttempts = maxAttempts - attempts;
                    System.out.println("Attempts left: " + remainingAttempts);
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("You have reached the maximum number of attempts. Account locked.");
            }
        }
    }

    // Method to read password input without echoing characters
    private static String getPasswordInput() {
        java.io.Console console = System.console();
        if (console == null) {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
        char[] passwordChars = console.readPassword();
        return new String(passwordChars);
    }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
