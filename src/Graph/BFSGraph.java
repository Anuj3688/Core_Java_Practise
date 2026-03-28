package Graph;

import java.util.*;

public class BFSGraph {
    public static void BFS(int source , UndirectedGraph graph){
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(source);
        visited.add(source);
        answer.add(source);

        while (!q.isEmpty()){
            int element = q.poll();
            System.out.println("Current Element: "+element);
            List<Integer> connections = graph.getConnectedNodes(element);
            for (int a:connections) {
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
        learn.addEdge(1 ,2);
        learn.addEdge(1,3);
        learn.addEdge(3,4);
        learn.addEdge(5,2);
        learn.addEdge(5,4);
        learn.addEdge(4,2);
        BFS(1,learn);

    }
}
