import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); 
    System.out.println("Input a number that would be the size of the Adjacency Matrix: ");

//INPUT A SIZE FOR THE ADJACENCY MATRIX. SIZE WOULD BE A SQUARE, SO THE NUMBER OF ROWS AND COLUMNS WOULD BE THE SAME "SIZE"
    int size = s.nextInt();  

    BST tree = new BST(size); 

//TEST FOR THE "INSERT" METHOD 
    tree.printGraph();
    tree.insert(3, 4);
    tree.insert(2, 4);
    tree.insert(1, 4);
    tree.insert(5, 4);
    tree.insert(0, 4);
    tree.insert(5, 7);
    tree.printGraph();

//TEST FOR THE "DELETE" METHOD
    tree.delete(3, 4);
    tree.delete(5, 4);
    tree.printGraph();

//TEST FOR THE "FIND" METHOD 
    System.out.println("\nWas the element found? " + tree.find(8));

//TEST FOR THE "REBALANCE" METHOD 
    tree.rebalance();
    tree.printGraph();


  }
}