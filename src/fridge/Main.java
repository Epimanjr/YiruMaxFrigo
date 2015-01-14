package fridge;

import java.util.Scanner;

/**
 *
 * @author Maxime BLAISE
 */
public class Main {

    /**
     * For read.
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Main method.
     *
     * @param args arguments.
     */
    public static void main(String[] args) {
        // First ask
        String line = askForLine();
        // Loop
        while(!line.equals("exit") && !line.equals("EXIT")) {
            // Process
            processing(line);
            // New ask
            line = askForLine();
        }
    }

    /**
     * Return user's line.
     *
     * @return String
     */
    public static String askForLine() {
        System.out.print("FriJo-Shell:$ ");
        return sc.nextLine();
    }

    /**
     * Analyze line.
     */
    private static void processing(String line) {
        switch(line) {
            
        }
    }
}
