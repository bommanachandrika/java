import java.util.*;

public class SimpleDFS {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        graph = new ArrayList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (undirected)
        graph[0].add(1);
        graph[1].add(0);

        graph[0].add(2);
        graph[2].add(0);

        graph[1].add(3);
        graph[3].add(1);

        System.out.println("DFS starting from node 0:");
        dfs(0);
    }
}
