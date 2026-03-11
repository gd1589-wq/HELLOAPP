public class HelloDefault {

    public static void main(String[] args) {

        // Check if command-line argument exists
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } 
        else {
            // Default message
            System.out.println("Hello World");
        }

    }

}