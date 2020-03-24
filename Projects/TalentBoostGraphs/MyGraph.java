package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyGraph {
    int V;
    LinkedList<Integer> adj[];
    MyGraph(int V){
        this.V = V;
        this.adj = new LinkedList[V];
        for(int i = 0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }

    //boolean hasEdgeTo(int v1, int v2)

    //boolean hasEdgeFrom(int v1, int v2)

    //int[] getNeighbours(int v)

    //int[] getParents(int v)

    //int[] distanceN(int v, int n)

    //boolean directed()

    //boolean connected()

    //int connectedCount()

    //boolean cyclic()

    //int diameter()


}
