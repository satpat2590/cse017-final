import java.util.Arrays;

class BST {


int[][] graph; 
int tempMax; 

//ADJACENCY MATRIX AS THE BINARY TREE
  BST(int max) {
    graph = new int[max][max];
    tempMax = max; 
  }

//INCORPORATED THE "public boolean i(int from, int to)" METHOD INTO THE INSERT METHOD, WHICH SEARCHES THE ADJACENCY MATRIX TO SEE IF THE VALUES OF FROM AND TO ARE PRESENT IN THE MATRIX PRIOR TO THE ADDITION. IF ONLY ONE ELEMENT IS PRESENT, THEN IT RETURNS TRUE, BECAUSE THE OTHER ELEMENT IS NEWLY ADDED INTO THE MATRIX 
  public void insert(int from, int to) {
    System.out.println(i(from, to));

    graph[from][to] = 1; 
  }

  
//THIS METHOD FINDS THE SPECIFIC VALUE LABELED "ITEM" AND THEN RETURNS IF FOUND AND FALSE IF IT DOESN'T EXIST. 
  public boolean find(int item) {
    for (int x = 0; x < tempMax; x++) {
      if (graph[item][x] == 1) {
        return true; 
      }
    }

    for (int x = 0; x < tempMax; x++) {
      if (graph[x][item] == 1) {
        return true; 
      }
    }

    return false; 
    
  }

//HELPER METHOD FOR THE INSERT METHOD, RETURNS EITHER TRUE OR FALSE DEPENDING ON IF VALUES ARE PRESENT IN THE MATRIX 
  public boolean i(int to, int from) {
    int count = 0; 

    if (graph[from][to] == 1) {
      count = count + 2; 
    }

    for (int x = 0; x < tempMax; x++) {
      if (graph[from][x] == 1) {
        count = count + 1; 
        break; 
      }
    }

    for (int x = 0; x < tempMax; x++) {
      if (graph[to][x] == 1) {
        count = count + 1;
        break;
      }
    }

    if (count >= 2) { 
      return false; 
  } else {
      return true; 
   }
}

//THIS METHOD DELETES A CONNECTION FROM THE ADJACENCY MATRIX, AND ALSO USES THE METHOD "public boolean d(int to, int from)" TO PRINT OUT IF THE MATRIX ACTUALLY DELETED THE ENTIRE NODE OR IF THE SEVERANCE OF THE CONNECTION DIDN'T REMOVE THE NODE DUE TO ANOTHER ELEMENT BEING CONNECTED TO IT. 
  public void delete(int from, int to) {
    graph[from][to] = 0; 

    System.out.println(d(to, from));
  }

//HELPER METHOD FOR DELETE, PRACTICALLY RETURNS TRUE IF THE VALUE(S) ARE NO LONGER IN THE GRAPH, AND RETURN FALSE IF THE VALUE(S) ARE STILL PRESENT IN THE GRAPH. 
  public boolean d(int to, int from) {
    int count = 0; 

    if (graph[from][to] == 1) {
      count = count + 2; 
    }

    for (int x = 0; x < tempMax; x++) {
      if (graph[from][x] == 1) {
        count = count + 1; 
        break; 
      }
    }

    for (int x = 0; x < tempMax; x++) {
      if (graph[to][x] == 1) {
        count = count + 1;
        break;
      }
    }

    if (count >= 2) { 
      return false; 
  } else {
      return true; 
   }
}

//BASIC PRINT METHOD TO SHOW THE ENTIRE GRAPH 
  public void printGraph() {
    for (int x = 0; x < tempMax; x++) {
      System.out.println(Arrays.toString(graph[x]));
    }
  }

}