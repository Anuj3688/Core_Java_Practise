package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph {
    Map<Integer, List<Integer>> adjList;

    UndirectedGraph(int v) {
        adjList = new HashMap<>();
    }

    List<Integer> getConnectedNodes(int u) {
        return adjList.getOrDefault(u, new ArrayList<>());
    }

    void addEdge(int u, int v) {
        //Dynamic adding values
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        //Un directed Graph

        adjList.get(u).add(v);
        adjList.get(v).add(u);

        // Directed Graph
        // adjList.get(u).add(v);
    }

    void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();

            System.out.println("" + key + "  ----> " + value);
        }
    }

    void BFSTraversal(){

    }
}
