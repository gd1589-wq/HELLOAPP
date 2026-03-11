public class HelloName {

    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {

            // Print greeting using command line argument
            System.out.println("Hello " + args[0]);

        } else {

            // If no argument provided
            System.out.println("Please provide your name.");

        }

    }

}