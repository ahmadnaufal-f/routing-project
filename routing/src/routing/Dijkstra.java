package routing;
import java.util.Scanner;

public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//making matrix
		int[][] matrix = new int[5][5];
		int[] distance = new int[5]; 
		int[] visited = new int[5];
		int[] preD = new int[5];
		int min;
		int nextNode=0;
		System.out.println("Enter the Matrix: ");
		
		for(int i=0;i<5;i++){
			visited[i] = 0;
			preD[i]=0;
			for(int j=0;j<5;j++){
				
				matrix[i][j] = scan.nextInt();
				if(matrix[i][j] == 0){
				matrix[i][j] = 999; //max value
					}
				
				}
			
			
		}
		
		distance = matrix[0];
		distance[0] = 0;
		visited[0]=1;
		
		for(int i=0;i<5;i++){
			min = 999;
		
			for(int j=0;j<5;j++){
				
				if(min>=distance[j] && visited[j]!=1){
					min = distance[j];
					nextNode = j;
				}
				
			}
			visited[nextNode] = 1;
			for(int x=0;x<5;x++){
				if(visited[x]!=1){
					if(min+matrix[nextNode][x]<distance[x]){
						distance[x] = min+matrix[nextNode][x];
						preD[x] = nextNode;
					}
				}
			}
			
			
		}
		for(int i=0;i<5;i++){
			System.out.print("|" + distance[i]);
		}
		System.out.print("|");
		
		for(int i=0;i<5;i++){
			int j;
			System.out.print("Path = "+i);
			j=i;
			
			do{
				j = preD[j];
				System.out.print(" <- "+j);
			}while(j!=0);
			System.out.println("");
		}

	}

}
