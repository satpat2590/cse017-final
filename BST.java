class BST {

  int[][] constructor; 
  int[][] graph; 

//ADJACENCY MATRIX AS THE BINARY TREE
  public BST(int[][] constructor) {
    graph = constructor; 
  }

  public void add_link(int from, int to) {
    graph[from][to] = 1; 
  }
  
  public void remove_link(int from, int to) {
    graph[from][to] = 0; 
  }


}