import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("DECLARE YOUR VARIABLE'S TYPE:");
        String type = scan.nextLine();

        System.out.println("DECLARE YOUR VARIABLE'S NAME");
        String name = scan.nextLine();

        ArrayList<Variable> variables = new ArrayList<Variable>();
        Variable vrbl = new Variable(name, type);
        variables.add(vrbl);

        App.printVariablesNames(variables);
        vrbl.getBits();
        App.getTotalBits(variables);
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
