package io92.data_structures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MyGraph {

	public static void main(String[] args) {
		MyGraph graph = new MyGraph();
		graph.addNode(0);
		graph.addNode(1);
		graph.addNode(2);
		graph.addNode(3);
		graph.addNode(4);
		graph.addNode(5);
		graph.addNode(6);
		graph.addEdge(3, 1);
		graph.addEdge(3, 4);
		graph.addEdge(4, 2);
		graph.addEdge(4, 5);
		graph.addEdge(1, 2);
		graph.addEdge(1, 0);
		graph.addEdge(0, 2);
		graph.addEdge(6, 5);
		graph.showConnections();
	}

	private HashMap<Integer, List<Integer>> adjacentList;
	private int numberOfNodes;

	public MyGraph() {
		adjacentList = new HashMap<Integer, List<Integer>>();
		numberOfNodes = 0;
	}

	public void addNode(int node) {
		adjacentList.put(node, new ArrayList<Integer>());
		numberOfNodes++;
	}

	public void addEdge(int node1, int node2) {
		adjacentList.get(node1).add(node2);
		adjacentList.get(node2).add(node1);
	}

	public void showConnections() {
		Set<Integer> allNodes = adjacentList.keySet();

		for (int i : allNodes) {
			List<Integer> allConnections = adjacentList.get(i);
			StringBuilder storeAllConnectionsToPrint = new StringBuilder().append(i).append("--->");

			for (int j : allConnections) {
				storeAllConnectionsToPrint.append(j).append(" ");
			}
			System.out.println(storeAllConnectionsToPrint);
		}
	}

	public int getNumberOfNodes() {
		return numberOfNodes;
	}
	
	
}
