import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Variable> Varis = new ArrayList<Variable>();
        Variable bobVariable = new Variable("Bob", "theBigMan");

    }

    public static void printVariablesNames(ArrayList<Variable> variables) {

        for (int i = 0; i < variables.size(); i++) {
            System.out.println(variables.get(i).getName() + "\n");
        }
    }
}
