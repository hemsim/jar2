//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a jar file");
        if (args.length > 0) {
            System.out.println("I have arguments");
            for (String s : args) System.out.println("One of the arguments is: " + s);
        }
    }
}