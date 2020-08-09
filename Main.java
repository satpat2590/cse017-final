import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); 
    System.out.println("Input a number that would be the size of the Adjacency Matrix: ");

    int size = s.nextInt();  

    BST tree = new BST(size); 

    tree.printGraph();
    tree.insert(3, 4);
    tree.insert(2, 4);
    tree.insert(1, 4);
    tree.insert(5, 4);
    tree.insert(0, 4);
    tree.insert(5, 7);
    tree.printGraph();

    tree.delete(3, 4);
    tree.delete(5, 4);
    tree.printGraph();

    System.out.println("\nWas the element found? " + tree.find(8));

    tree.rebalance();
    tree.printGraph();


  }
}