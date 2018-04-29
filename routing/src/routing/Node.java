package routing;

import java.util.ArrayList;

public class Node {
	
	private boolean visit; //for validation whether the neighbor node is visitedalready in the current iteration or not

	private ArrayList<Edge> edge = new ArrayList<Edge>(); //used to add neighbor nodes for the current node, the edge connect them
	private int costFromPrevNode = Integer.MAX_VALUE; //initialized to be max value to be compared to find the shortest path

	public boolean isVisit() {
		return visit;
	}
	public void setVisit(boolean visit) {
		this.visit = visit;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	public void setEdge(ArrayList<Edge> edge) {
		this.edge = edge;
	}
	public int getCostFromPrevNode() {
		return costFromPrevNode;
	}
	public void setCostFromPrevNode(int costFromPrevNode) {
		this.costFromPrevNode = costFromPrevNode;
	}
	
	
}
