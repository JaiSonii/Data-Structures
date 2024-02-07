package Graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.printGraph();

        // System.out.println("Removing Edge:");
        // graph.removeEdge("A", "B");
        // graph.printGraph();

        System.out.println("Removing Vertex:");
        graph.removeVertex("C");
        graph.printGraph();
    }
}
