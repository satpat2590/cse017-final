import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); 
    System.out.println("Input a number that would be the size of the Adjacency Matrix: ");

    int size = s.nextInt();  

    BST tree = new BST(size); 

    tree.add_link(3, 4);
    tree.add_link(1, 4);

    tree.printGraph();

    System.out.println(tree.find(4)); 


  }
}