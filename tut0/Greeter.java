
/**
 * The Greeter class provides methods to greet and say goodbye to the user.
 */
public class Greeter {
    /**
     * Main method to execute the greeter and goodbye functions.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String name = getName();
        greeter(name);
        goodbye(name);
    }

    /**
     * Gets the user's name from input.
     * @return the user's name
     */
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    /**
     * Prints a greeting to the user.
     * @param name the user's name
     */
    public static void greeter(String name) {
        System.out.println("Greetings, " + name + "! Welcome to our program.");
    }

    /**
     * Prints a parting message to the user.
     * @param name the user's name
     */
    public static void goodbye(String name) {
        System.out.println("Goodbye, " + name + "! Have a great day.");
    }
}

