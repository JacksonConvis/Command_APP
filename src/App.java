import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = "yes";
        ArrayList<Variable> variables = new ArrayList<Variable>();

        System.out.println("welcome to the program! enter yes or } to exit");
        ans = scan.nextLine();

        while (ans.equalsIgnoreCase("yes")) {

            System.out.println("DECLARE YOUR VARIABLE'S TYPE:");
            String type = scan.nextLine();

            System.out.println("DECLARE YOUR VARIABLE'S NAME");
            String name = scan.nextLine();

            Variable vrbl = new Variable(name, type);

            variables.add(vrbl);

            vrbl.getBits();

            System.out.println("Do you wish to continue?");
            ans = scan.nextLine();

        }

        System.out.println("VARIABLE'S NAME'S :");
        App.printVariablesNames(variables);
        System.out.println("TOTAL BIT COUNT: " + App.getTotalBits(variables));
        System.out.println("BYE");
        scan.close();
    }

    public static void printVariablesNames(ArrayList<Variable> variables) {

        for (int i = 0; i < variables.size(); i++) {
            System.out.println(variables.get(i).getName() + "\n");
        }
    }

    public static int getTotalBits(ArrayList<Variable> variables) {
        int totalBits = 0;
        for (int i = 0; i < variables.size(); i++) {
            totalBits += variables.get(i).getBits();
        }
        return totalBits;

    }

}
