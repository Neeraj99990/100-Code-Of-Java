// Graph Representation using Adjacency Matrix:
class Graph {
    private final int V;
    private final int[][] adjMatrix;

    public Graph(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Code68 {
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.printGraph();
    }
}
