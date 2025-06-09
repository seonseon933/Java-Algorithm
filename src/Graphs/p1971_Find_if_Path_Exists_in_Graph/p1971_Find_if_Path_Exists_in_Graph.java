package Graphs.p1971_Find_if_Path_Exists_in_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1971_Find_if_Path_Exists_in_Graph {
    boolean[] seen;
    Map<Integer, List<Integer>> graph = new HashMap<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        seen = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
        }
        
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return dfs(source, destination);
    }

    private boolean dfs(int node, int dest) {
        if(node == dest) return true;
        if(seen[node]) return false;

        seen[node] = true;

        for(int n : graph.get(node)) {
            if(dfs(n, dest)) return true;
        }

        return false;
    }
}
