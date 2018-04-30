package routing;

import java.util.HashSet; //this hashset is used for storage, can be accessed through a key
import java.util.Iterator;
import java.util.Set;

public class Computation {
	int distance[];
	private int adjacencyMatrix[][]; // this is used to determine the graph of the routing table
	private Set<Integer> settled; //settled because the nodes are already traveled to from the source in finding the shortest distance.
	private Set<Integer> unsettled; //unsettled because these nodes are not yet traveled to from the source in finding the shortest distance.
	private int nodesNum = 5;
	
	public Computation(int nodesNumb) //constructor, this is the initialization
	{
		nodesNumb = nodesNum; //there are 5 hosts so number of nodes will be 5
		distance = new int[6];
		settled = new HashSet<Integer>();
		unsettled = new HashSet<Integer>();
		adjacencyMatrix = new int[6][6];  //6 because total number of nodes are 5, added by 1 because it is used to store null at the end
	}
	
	public void algorithm(int AdjacencyMatrix[][], int source)
	{
		int calculateNode; //this will be the node that will be processed, after it is processed, it will be placed in the settled sets instead of unsettled
		
		for (int i = 1; i <= 5; i++) 
		{
			for(int j =1; j<=5; j++)
			{
				adjacencyMatrix[i][j] = AdjacencyMatrix[i][j]; //since this function requires the input of the adjacency matrix and source
													//the adjacency matrix in the input and this function must be fitted
			}
		}
		
		for(int i =1; i<=5; i++)
		{
			// System.out.println(i);
			distance[i] = Integer.MAX_VALUE; //make all the distance in each node infinity so that it can be compared later on to find the minimum distance.
		}
		
		unsettled.add(source); //source is added in this list because it is needed to find the minimum distance from the current source
		distance[source] = 0; //distance from current source to the next neighbor node is 0 initially since we haven't calculate who are the neighbors
		while(!unsettled.isEmpty())
		{
			calculateNode = calculateNeighborToFindMinimum(); //this is to find the next node, with the minimum distance, from the current node in the unsettled.
			unsettled.remove(calculateNode);
			settled.add(calculateNode); //after it is settled (finding the next node in the path, the node will be put in the settled list
			nextNode(calculateNode); //now it is time to assess the neighbor of the current node
		}
	}

	private int calculateNeighborToFindMinimum() {
		// TODO Auto-generated method stub
		int minimum;
		int node =0;
		
		Iterator<Integer> increment = unsettled.iterator(); //this iterator is used to iterate the unsettled list in order to find the minimum distance
		node = increment.next();												//from the traveled nodes
		minimum = distance[node]; //initialize to have the first node as the minimum first
		
		for(int i=1; i<=distance.length;i++) //loop to read all distance within the nodes
		{
			if(unsettled.contains(i)) //validate all the nodes that is not yet traveled
			{
				if(distance[i] <= minimum)
				{
					minimum = distance[i]; //since the distance in all the nodes are all infinity at first, this condition will be true 
						//when run at first in order to initialize the minimum
					//however, the initialized minimum distance will be compared with other distances later on to find the final minimum
					node =i; //finally the minimum distance is found, this node will be the one that will be traveled on next	
				}
			}
			
		}
		
		return node;
	}

	private void nextNode(int source) {
		// TODO Auto-generated method stub
		int edge = 0;
		int nextDistance =0;
		for(int i=1; i<=nodesNum; i++)
		{
			
			
			for(int destination =1; destination <=5; destination++)
			{
				if(!settled.contains(destination)) //this is to evaluate whether the next node to be evaluated is not yet traveled
				{
					edge = adjacencyMatrix[source][destination]; //edge will be initialize later on based on the matrix, thex-axis is the source, the current node
																//while the destination is the neighbor nodes, in the y-axis of the matrix.
					nextDistance = distance[source] + edge; //the distance after added by the edge will be distance from the source to the neighbor node
															//added by the edge connecting them both
					if(nextDistance < distance[destination])
					{
						distance[destination] =nextDistance; //since there may be more than one node connected to the current node
								//we must evaluate all of them, if the new distance is greater than the current distance, we finally find the minimum one
								//and make is as our next destination. This iteration will be repeated until all neighbor nodes have been traveled
					}
					unsettled.add(destination); //the node here will be put in the unsettled list to be evaluated next
					
				}
			}
		}
	}
	
	
	
	}
