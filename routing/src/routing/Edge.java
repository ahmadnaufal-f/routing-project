package routing;

public class Edge {

	private int source; //the source node, can be the next node 
	private int destination; //the destination node, can be the previous node
	private int edgeCost; //the cost of the edge, the weight of it
	
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public int getEdgeCost() {
		return edgeCost;
	}
	public void setEdgeCost(int edgeCost) {
		this.edgeCost = edgeCost;
	}
	
	
}
