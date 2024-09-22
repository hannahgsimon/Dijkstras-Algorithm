/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphs;

/**
 *
 * @author hgsim
 */
public class Neighbor {
    
    private int vertex;
    private int cost;
    
    public Neighbor(int vertex, int[][] graph, int startingVertex)
    {
        this.vertex = vertex;
        this.cost = graph[startingVertex][vertex];
    }
    
    public int getVertex()
    {
        return(vertex);
    }
    
    public int getCost()
    {
        return(cost);
    }
    
}
