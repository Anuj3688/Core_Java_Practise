package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFSGraph {

    // here we are focusing through the left most path
    public static void DFS(int source, UndirectedGraph graph, Set<Integer> visited){
        System.out.println(source);
        visited.add(source);

        List<Integer> connectors = graph.getConnectedNodes(source);
        for(int node : connectors){
            if (!visited.contains(node)){
                DFS(node,graph,visited);
            }
        }
    }

    public static void printAllPaths(int source,
                                     UndirectedGraph graph,
                                     Set<Integer> visited,
                                     List<Integer> path) {

        visited.add(source);
        path.add(source);

        // Print current path
        System.out.println(path);

        List<Integer> connectors = graph.getConnectedNodes(source);

        for (int node : connectors) {
            if (!visited.contains(node)) {
                printAllPaths(node, graph, visited, path);
            }
        }

        // BACKTRACK
        path.remove(path.size() - 1);
        visited.remove(source);
    }

    public static void main(String[] args) {
        UndirectedGraph learn = new UndirectedGraph(5);
        learn.addEdge(1 ,2);
        learn.addEdge(1,3);
        learn.addEdge(3,4);
        learn.addEdge(5,2);
        learn.addEdge(5,4);
        learn.addEdge(4,2);
        printAllPaths(3,learn,new HashSet<>(), new ArrayList<>());

        //For unconnected Graphs
        Set<Integer> visited = new HashSet<>();
        for (int i=1; i<=5 ; i++){
            DFS(i,learn,visited);
        }

    }
}
