package Graph;


import java.util.List;
import java.util.Map;

public class GraphStart {

    public static void main(String[] args) {
        UndirectedGraph learn = new UndirectedGraph(5);
        learn.addEdge(1 ,2);
        learn.addEdge(1,3);
        learn.addEdge(3,4);
        learn.addEdge(5,2);
        learn.addEdge(5,4);
        learn.addEdge(4,2);

        learn.printGraph();
    }
}
