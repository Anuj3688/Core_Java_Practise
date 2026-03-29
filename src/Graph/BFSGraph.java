package Graph;

import java.util.*;

public class BFSGraph {

    /*
     * Here we need to maintain 2 things a queue and set
     * Queue to store the values that we need to look into
     * Set to store the values that we have already visited
     * Set to make sure that we are not stuck in a infinite loop
     * */
    public static void BFS(int source, UndirectedGraph graph, Set<Integer> visited) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited.add(source);
        answer.add(source);

        while (!q.isEmpty()) {
            int element = q.poll();
            System.out.println("Current Element: " + element);
            List<Integer> connections = graph.getConnectedNodes(element);
            for (int a : connections) {
                if (!visited.contains(a)) {
                    q.offer(a);
                    visited.add(a);
                    answer.add(a);
                }
            }
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {
        UndirectedGraph learn = new UndirectedGraph(5);
        learn.addEdge(1, 2);
        learn.addEdge(1, 3);
        learn.addEdge(3, 4);
        learn.addEdge(5, 2);
        learn.addEdge(5, 4);
        learn.addEdge(4, 2);

        //For unconnected Graphs
        Set<Integer> visited = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            BFS(i, learn, visited);
        }

    }
}
