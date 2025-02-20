// TreeTest.java
import java.util.Scanner;

public class TreeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a tree and insert some values
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Get input from user
        System.out.print("Enter a number to search for: ");
        int key = input.nextInt();

        // Search for the key and display the result
        Integer result = tree.contains(key);
        if (result != null) {
            System.out.println("The number " + key + " is found in the tree.");
        } else {
            System.out.println("The number " + key + " is NOT found in the tree.");
        }

        input.close();
    }
}
