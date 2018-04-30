package routing;

import java.util.Scanner;

public class MainDijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int AdjacencyMatrix[][];
		int nodeNum =5;
		int source=0, destination=0; //initialize the source and destination to be 0 first
		
		
           
            AdjacencyMatrix = new int[5][5];
 
            for (int i = 1; i <= nodeNum; i++)
            {
                for (int j = 1; j <=nodeNum; j++)
                {

                    System.out.printf("Enter the cost of the edge for the matrix for the source of %d to te destination of %d : ", i, j);
                    AdjacencyMatrix[i][j] = sc.nextInt();
                    if (i == j)
                    {
                        AdjacencyMatrix[i][j] = 0; //if source and destination node traveled is the same, edge will be 0
                        continue; //to skip the other parts of the code in the loop
                    }
                    if (AdjacencyMatrix[i][j] == 0)
                    {
                        AdjacencyMatrix[i][j] = Integer.MAX_VALUE; //0 to be compared with other values in the matrix
                    }
                }
            }
 
            System.out.println("Enter the source node: ");
            source = sc.nextInt();
 
            System.out.println("Enter the destination node: ");
            destination = sc.nextInt();
 
            Computation dijkstra = new Computation(nodeNum);
            dijkstra.algorithm(AdjacencyMatrix, source);
 
            System.out.println("The shortest path from " + source + " to " + destination + " is ");
            for (int i = 1; i <= dijkstra.distance.length-1; i++) //subtract by 1 because initially distance[node] is 0
            {
                if (i == destination)
                    System.out.println(source + " to " + i + " is "  //to find the destination in the loop to calculate 
                    						//the formula is the current source added by the distance to the destination
                            + dijkstra.distance[i]);
            }
        
        sc.close();
    }
}
		
