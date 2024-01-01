package Graph;

import Graph.Graph;
@SuppressWarnings("unused")
class Dijkstra{
	public static void dijikstra(int[][]graph,int source) {
		int count=graph.length;
		boolean[] visitedVertex= new boolean[count];
		int[] distance= new int [count];
		for(int i=0;i<count;i++) {
			visitedVertex[i]=false;
			distance[i]=Integer.MAX_VALUE;
			
		}
		distance[source]=0;
		for(int i=0;i<count;i++) {
			int u=findMinDistance(distance,visitedVertex);
			visitedVertex[u]=true;
			for(int v=0;v<count;v++) {
				if(!visitedVertex[v]&&graph[u][v]!=0&&(distance[u]+graph[u][v]<distance[v])) {
					distance[v]=distance[u]+graph[u][v];
				}
			}
		}
		for(int i=0;i<distance.length;i++) {
			System.out.println(String.format("Distance from %s to %s is %S",source,i,distance[i]));
		}
	}
	private static int findMinDistance(int []distance,boolean[] visitedVertex) {
		int minDistance = Integer.MAX_VALUE;
		int minDistanceVertex =-1;
		for(int i=0;i<distance.length;i++) {
			if(!visitedVertex[i]&& distance[i]<minDistance) {
				minDistance = distance[i];
				minDistanceVertex =i;
			}
		}
		return minDistanceVertex;
	}
}

class Shortestpath {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int graph[][]=new int[][]
				{{0,1,1,2,0,0,0},
				{0,0,2,0,0,3,0},
				{1,2,0,1,3,0,0},
				{2,0,1,0,2,0,1},
				{0,0,3,0,0,2,0},
				{0,3,0,0,2,0,1},
				{0,2,0,1,0,1,0}};
	Dijkstra T= new Dijkstra();
	T.dijikstra(graph, 0); 
}
	}
