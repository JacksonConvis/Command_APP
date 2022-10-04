import java.util.ArrayList;
import java.util.Scanner;

//if you want to quit on the first round, you will be prompted to enter "}" twice to verify your decision and have at least one variable declared

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = "yes";
        System.out.println("welcome to the program! enter yes or } to exit");
        ans = scan.nextLine();

        if (ans.equals("yes")) {

            System.out.println("DECLARE YOUR VARIABLE'S TYPE:");
            String type = scan.nextLine();

            System.out.println("DECLARE YOUR VARIABLE'S NAME");
            String name = scan.nextLine();

            ArrayList<Variable> variables = new ArrayList<Variable>();

            Variable vrbl = new Variable(name, type);

            variables.add(vrbl);

            vrbl.getBits();

            System.out.print("VARIABLE'S NAME:");
            App.printVariablesNames(variables);
            System.out.println("BIT COUNT: " + App.getTotalBits(variables));
        }

        do {

            System.out.println("welcome to the program! enter yes or } to exit");
            ans = scan.nextLine();

            System.out.println("DECLARE YOUR VARIABLE'S TYPE:");
            String type = scan.nextLine();

            System.out.println("DECLARE YOUR VARIABLE'S NAME");
            String name = scan.nextLine();

            ArrayList<Variable> variables = new ArrayList<Variable>();

            Variable vrbl = new Variable(name, type);

            variables.add(vrbl);

            vrbl.getBits();

            System.out.println("VARIABLE'S NAME:");
            App.printVariablesNames(variables);
            System.out.println("BIT COUNT: " + App.getTotalBits(variables));
        } while (ans.equals("yes"));
        System.out.println("BYE");
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
