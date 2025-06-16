import java.util.*;

public class AdjList {
    public static void main(String args[]) {
        int vertices = 4;
        ArrayList<Integer> adjList[] = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }

        adjList[0].add(1);
        adjList[1].add(0);
        adjList[0].add(2);
        adjList[2].add(0);
        adjList[1].add(3);
        adjList[3].add(1);
        
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
