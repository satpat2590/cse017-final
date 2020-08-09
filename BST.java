import java.util.Arrays;

class BST {


int[][] graph; 
int tempMax; 

//ADJACENCY MATRIX AS THE BINARY TREE
  BST(int max) {
    graph = new int[max][max];
    tempMax = max; 
  }

  public void add_link(int from, int to) {
    graph[from][to] = 1; 
  }

  public boolean find(int item) {
    for (int x = 0; x < tempMax; x++) {
      for (int y = 0; y < tempMax; y++) {
        if (graph[x][y] == 1) {
          return true; 
        }
      }
    }

    return false; 
    
  }
  
  public void remove_link(int from, int to) {
    graph[from][to] = 0; 
  }


  public void printGraph() {
    for (int x = 0; x < tempMax; x++) {
      System.out.println(Arrays.toString(graph[x]));
    }
  }

}