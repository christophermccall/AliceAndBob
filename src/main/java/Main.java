import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {
    public static void main(String[] args ){
        // create a new object of class Main
        Main myObj = new Main();
        // call the compute() method on that new object
        myObj.compute();
    }
    public void compute() {
        // Get input string of name from user
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // Create conditional to check name against Alice and Bob
        if(name.compareTo("Alice")== 0 || name.compareTo("Bob")==0) {
            System.out.println("Howdy!");
        } else {
            System.out.println("You are neither Alice nor Bob.");
        }

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
