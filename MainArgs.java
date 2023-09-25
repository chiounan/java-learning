public class MainArgs {
    public static void main(String args[]) {
        if (args.length > 0) {
            System.out.println("There are " + args.length + " command line arguments: ");
            for (String val : args)
                System.out.println(val);                
        }
        else
            System.out.println("No command line arguments.");
    }
}
